package cn.jianke.reflectdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @className: MainActivity
 * @classDescription: 测试反射
 * @author: leibing
 * @createTime: 2017/2/18
 */
public class MainActivity extends AppCompatActivity {
    // 反射类
    private Class reflectClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 获取反射类
        try {
            getReflectClass();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 获取无构造参数对象
        try {
            getObject();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        // 获取属性
        getFields();
        // 获取方法
        getMethod();
    }

    /**
     * 获取反射类
     * @author leibing
     * @createTime 2017/2/18
     * @lastModify 2017/2/18
     * @param
     * @return
     */
    private void getReflectClass() throws ClassNotFoundException {
        // method one
        reflectClass = Class.forName("cn.jianke.reflectdemo.ReflectClass");
        // method two
        reflectClass = ReflectClass.class;
        // method thress
        reflectClass = new ReflectClass().getClass();
    }

    /**
     * 获取无构造参数对象
     * @author leibing
     * @createTime 2017/2/18
     * @lastModify 2017/2/18
     * @param
     * @return
     */
    private void getObject() throws IllegalAccessException, InstantiationException {
        if (reflectClass != null) {
            ReflectClass mReflectClass = (ReflectClass) reflectClass.newInstance();
            System.out.println("getObject protectedConstants = " + mReflectClass.protectedConstants);
            System.out.println("getObject protectedVariate = " + mReflectClass.protectedVariate);
            System.out.println("getObject publicConstants = " + mReflectClass.publicConstants);
            System.out.println("getObject publicVariate = " + mReflectClass.publicVariate);
        }
    }

    /**
     * 获取属性
     * @author leibing
     * @createTime 2017/2/18
     * @lastModify 2017/2/18
     * @param
     * @return
     */
    private void getFields() {
        // 获取所有属性
        Field[] fs = reflectClass.getFields();
        // 定义可变的字符串，用来存储属性
        StringBuffer sb = new StringBuffer();
        // 通过追加的方法，将每个属性拼接到此字符串中
        // 最外边的public定义
        sb.append(Modifier.toString(reflectClass.getModifiers()) + " class " +
                reflectClass.getSimpleName() +"{\n");
        //里边的每一个属性
        for(Field field:fs){
            //空格
            sb.append("\t");
            //获得属性的修饰符，例如public，static等等
            sb.append(Modifier.toString(field.getModifiers())+" ");
            //属性的类型的名字
            sb.append(field.getType().getSimpleName() + " ");
            //属性的名字+回车
            sb.append(field.getName()+";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }

    /**
     * 获取方法
     * @author leibing
     * @createTime 2017/2/18
     * @lastModify 2017/2/18
     * @param
     * @return
     */
    private void getMethod() {
        // 获取所有属性
        Method[] ms = reflectClass.getMethods();
        // 定义可变的字符串，用来存储属性
        StringBuffer sb = new StringBuffer();
        // 通过追加的方法，将每个属性拼接到此字符串中
        // 最外边的public定义
        sb.append(Modifier.toString(reflectClass.getModifiers()) + " class " +
                reflectClass.getSimpleName() +"{\n");
        //里边的每一个属性
        for(Method method:ms){
            //空格
            sb.append("\t");
            //获得属性的修饰符，例如public，static等等
            sb.append(Modifier.toString(method.getModifiers())+" ");
            //属性的类型的名字
            sb.append(method.getReturnType().getSimpleName() + " ");
            //属性的名字+回车
            sb.append(method.getName()+";\n");
        }
        sb.append("}");
        System.out.println(sb);
    }
}
