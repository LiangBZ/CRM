package cn.com.noomn.po;

import java.math.BigDecimal;

public class Product {
    private String productId;

    private String productName;

    private BigDecimal productPrice;

    private String productPdf;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductPdf() {
        return productPdf;
    }

    public void setProductPdf(String productPdf) {
        this.productPdf = productPdf == null ? null : productPdf.trim();
    }
}