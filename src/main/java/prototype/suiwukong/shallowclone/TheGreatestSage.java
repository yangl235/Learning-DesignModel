package prototype.suiwukong.shallowclone;

public class TheGreatestSage {
    private Monkey monkey = new Monkey();

    public void change() {
        //创建大圣本尊对象
        Monkey copyMonkey;
        //空循环
        for (int i = 0; i < 2000; i++) {
        }
        //克隆大圣本尊
        copyMonkey = (Monkey) monkey.clone();
        System.out.println("Monkey King's birth date=" + monkey.getBirtthDate());
        System.out.println("Copy monkey's birth date=" + copyMonkey.getBirtthDate());
        System.out.println("copyMonkey == monkey?" + (copyMonkey == monkey));
        System.out.println("Monkey King's Staff == Copy Monkey's Staff?" + (monkey.getStaff() == copyMonkey.getStaff()));

    }

    public static void main(String [] args) {
        TheGreatestSage sage = new TheGreatestSage();
        sage.change();
    }
}
