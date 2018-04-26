package prototype.suiwukong.deepclone;

public class TheGreatestSage2 {
    private Monkey monkey = new Monkey();

    public void change() throws Exception {
        //创建大圣本尊对象
        Monkey copyMonkey;
        //空循环
        for (int i = 0; i < 2000; i++) {
        }
        //克隆大圣本尊
        copyMonkey = (Monkey) monkey.deepClone();
        System.out.println("Monkey King's birth date=" + monkey.getBirtthDate());
        System.out.println("Copy monkey's birth date=" + copyMonkey.getBirtthDate());
        System.out.println("copyMonkey == monkey?" + (copyMonkey == monkey));
        //TODO 执行结果不正确，深复制失败！
        System.out.println("Monkey King's Staff == Copy Monkey's Staff?" + (monkey.getStaff() == copyMonkey.getStaff()));

    }

    public static void main(String[] args) throws Exception {
        TheGreatestSage2 sage = new TheGreatestSage2();
        sage.change();
    }
}
