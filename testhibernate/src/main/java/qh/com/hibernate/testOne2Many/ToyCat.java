package qh.com.hibernate.testOne2Many;

public class ToyCat extends Toy {
    String miao;

    public String getMiao() {
        return miao;
    }

    public ToyCat setMiao(String miao) {
        this.miao = miao;
        return this;
    }
}
