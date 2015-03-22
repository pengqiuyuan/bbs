package cn.iver.common;

public class Const {
    // page size
    public static int TOPIC_PAGE_SIZE = 12;     // 首页分页
    public static int POST_PAGE_SIZE = 8;       // 跟帖分页
    public static int REPLY_PAGE_SIZE = 5;      // 回复分页
    public static int PAGE_SIZE_FOR_ADMIN = 30; // 管理员后台查看帖子，回帖，跟帖的分页大小
    // others
    public static String ADMIN_EMAIL = "iveryang@sina.cn";  // 配置管理员email
    public static String BBS_ID_SEPARATOR = "###";
    public static String TIMESTAMP = System.currentTimeMillis() + "";
    // 本地开发环境上 data source 的配置
    public static String DEV_JDBC_URL = "jdbc:mysql://localhost:3306/bbs";
    public static String DEV_USER = "root";
    public static String DEV_PASSWORD = "";
    // 运行环境上 data source 的配置
    public static String JDBC_URL = "XX";
    public static String USER = "XX";
    public static String PASSWORD = "XX";
    // beetl
    public static String BEETL_ROOT_DIR = "/WEB-INF/beetl";

}
