//package cn.com.noomn.test;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.List;
//
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//import org.junit.Before;
//import org.junit.Test;
//
//import cn.com.noomn.vo.UserVo;
//
//public class Mybatis_first {
//
//	// 会话工厂
//	private SqlSessionFactory sqlSessionFactory;
//
//	@Before
//	public void createSqlSessionFactory() throws IOException {
//		// 配置文件
//		String resource = "mybatis/sqlMapConfig.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//
//		// 使用SqlSessionFactoryBuilder从xml配置文件中创建SqlSessionFactory
//		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
//
//	}
//
//	// 根据 id查询用户信息
//	@Test
//	public void testFindUserById() {
//		// 数据库会话实例
//		SqlSession sqlSession = null;
//		try {
//			// 创建数据库会话实例sqlSession
//			sqlSession = sqlSessionFactory.openSession();
//			// 查询单个记录，根据用户id查询用户信息
//			List<UserVo> userVos = sqlSession
//					.selectList("cn.com.noomn.vo.mapper.selectAllUserVo");
//			// 输出用户信息
//			System.out.println(userVos);
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			if (sqlSession != null) {
//				sqlSession.close();
//			}
//		}
//	}
//
//}
