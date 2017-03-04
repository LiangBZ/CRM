package cn.com.noomn.util;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPrivateKeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.rsa.BCRSAPrivateKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

public final class RSAModel {

	private String publicKeyModulus;
	private String publicExponent;
	private String privateKeyModulus;
	private String privateExponent;

	private RSAModel() throws NoSuchAlgorithmException {
		KeyPairGenerator keyPairGen = 
				KeyPairGenerator.getInstance("RSA", new org.bouncycastle.jce.provider.BouncyCastleProvider());
		keyPairGen.initialize(1024, new SecureRandom());
		KeyPair keyPair = keyPairGen.generateKeyPair();

		PublicKey publicKey = keyPair.getPublic();
		publicKeyModulus = ((BCRSAPublicKey) publicKey).getModulus().toString(16);
		publicExponent = ((BCRSAPublicKey) publicKey).getPublicExponent().toString(16);

		PrivateKey privateKey = keyPair.getPrivate();
		privateKeyModulus = ((BCRSAPrivateKey) privateKey).getModulus().toString(16);
		privateExponent = ((BCRSAPrivateKey) privateKey).getPrivateExponent().toString(16);
	}
	
	/**
	 * 返回RSAModel实例
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static RSAModel getRSAModelInstance() throws NoSuchAlgorithmException {
		return new RSAModel();
	}
	
	/**
	 * RSA解密
	 * @param privateKeyModulus
	 * @param privateExponent
	 * @param text 密文
	 * @return
	 * @throws NoSuchAlgorithmException
	 * @throws NoSuchPaddingException
	 * @throws InvalidKeySpecException
	 * @throws DecoderException
	 * @throws InvalidKeyException
	 * @throws IllegalBlockSizeException
	 * @throws BadPaddingException
	 */
	public static String deciphering(
			final String privateKeyModulus,
			final String privateExponent, 
			final String text)
			throws NoSuchAlgorithmException, NoSuchPaddingException,InvalidKeySpecException, DecoderException, InvalidKeyException,IllegalBlockSizeException, BadPaddingException {
		
		// 先要生成私钥，不是重新生成，而是用上面的privateExponent和modulus
		BouncyCastleProvider provider = new org.bouncycastle.jce.provider.BouncyCastleProvider();
		KeyFactory keyFac = KeyFactory.getInstance("RSA", provider);
		RSAPrivateKeySpec priKeySpec = new RSAPrivateKeySpec(new BigInteger(privateKeyModulus, 16), new BigInteger(privateExponent, 16));
		RSAPrivateKey pk = (RSAPrivateKey) keyFac.generatePrivate(priKeySpec);

		// result就是页面传过来的登录密码的密文
		byte[] data = Hex.decodeHex(text.toCharArray());

		// 最后的解密
		Cipher cipher = Cipher.getInstance("RSA", provider);
		cipher.init(Cipher.DECRYPT_MODE, pk);
		byte[] de_password = cipher.doFinal(data);

		//明文
		return new StringBuilder(new String(de_password)).reverse().toString();
	}

	public String getPublicKeyModulus() {
		return publicKeyModulus;
	}

	public void setPublicKeyModulus(String publicKeyModulus) {
		this.publicKeyModulus = publicKeyModulus;
	}

	public String getPublicExponent() {
		return publicExponent;
	}

	public void setPublicExponent(String publicExponent) {
		this.publicExponent = publicExponent;
	}

	public String getPrivateKeyModulus() {
		return privateKeyModulus;
	}

	public void setPrivateKeyModulus(String privateKeyModulus) {
		this.privateKeyModulus = privateKeyModulus;
	}

	public String getPrivateExponent() {
		return privateExponent;
	}

	public void setPrivateExponent(String privateExponent) {
		this.privateExponent = privateExponent;
	}

	@Override
	public String toString() {
		return "RSAModel [" + "\n"
				+ "publicKeyModulus=" + getPublicKeyModulus() + "\n"
				+ "publicExponent=" + getPublicExponent() + "\n"
				+ "privateKeyModulus=" + getPrivateKeyModulus() + "\n"
				+ "privateExponent=" + getPrivateExponent() + "\n" 
				+ "]";
	}

}
