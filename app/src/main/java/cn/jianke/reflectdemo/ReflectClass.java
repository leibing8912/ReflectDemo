package cn.jianke.reflectdemo;

/**
 * @className: ReflectClass
 * @classDescription: 需要反射的类
 * @author: leibing
 * @createTime: 2017/2/18
 */
public class ReflectClass {
    /**------------------------------------------属性区---------------------------------------------
     ---------------------------------------------------------------------------------------------*/
    // 私有常量
    private final String privateConstants = "privateConstants";
    // 保护常量
    protected final String protectedConstants  = "protectedConstants";
    // 公开常量
    public final String publicConstants = "publicConstants";
    // 私有静态常量
    private final static String privateStatisConstants = "privateStatisConstants";
    // 保护静态常量
    protected final static String protectedStatisConstants = "protectedStatisConstants";
    // 公开静态常量
    protected final static String publicStatisConstants = "publicStatisConstants";
    // 私有变量
    private String privateVariate = "privateVariate";
    // 保护变量
    protected String protectedVariate = "protectedVariate";
    // 公开变量
    public String publicVariate = "publicVariate";
    // 私有静态变量
    private static String privateStaticVariate = "privateStaticVariate";
    // 保护静态变量
    protected static String protectedStaticVariate = "protectedStaticVariate";
    // 公开静态变量
    public static String publicStaticVariate = "publicStaticVariate";

    /**------------------------------------------方法区---------------------------------------------
     ---------------------------------------------------------------------------------------------*/
    private void privateTest(){

    }

    protected void protectedTest(){

    }

    public String getPrivateConstants() {
        return privateConstants;
    }

    public String getProtectedConstants() {
        return protectedConstants;
    }

    public String getPublicConstants() {
        return publicConstants;
    }

    public static String getPrivateStatisConstants() {
        return privateStatisConstants;
    }

    public static String getProtectedStatisConstants() {
        return protectedStatisConstants;
    }

    public static String getPublicStatisConstants() {
        return publicStatisConstants;
    }

    public String getPrivateVariate() {
        return privateVariate;
    }

    public void setPrivateVariate(String privateVariate) {
        this.privateVariate = privateVariate;
    }

    public String getProtectedVariate() {
        return protectedVariate;
    }

    public void setProtectedVariate(String protectedVariate) {
        this.protectedVariate = protectedVariate;
    }

    public String getPublicVariate() {
        return publicVariate;
    }

    public void setPublicVariate(String publicVariate) {
        this.publicVariate = publicVariate;
    }

    public static String getPrivateStaticVariate() {
        return privateStaticVariate;
    }

    public static void setPrivateStaticVariate(String privateStaticVariate) {
        ReflectClass.privateStaticVariate = privateStaticVariate;
    }

    public static String getProtectedStaticVariate() {
        return protectedStaticVariate;
    }

    public static void setProtectedStaticVariate(String protectedStaticVariate) {
        ReflectClass.protectedStaticVariate = protectedStaticVariate;
    }

    public static String getPublicStaticVariate() {
        return publicStaticVariate;
    }

    public static void setPublicStaticVariate(String publicStaticVariate) {
        ReflectClass.publicStaticVariate = publicStaticVariate;
    }
}
