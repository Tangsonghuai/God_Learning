package class_dir;

/**
 * God_Learning
 *
 * @author tangsonghuai
 * @date 2020/12/11 20:46
 */
public class interface_son implements interface_father {
    public String tell() {
        return "必须实现该方法";
    }

    public static void main(String[] args) {
        interface_son is = new interface_son();
        is.tell();
    }


}
