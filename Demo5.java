import java.awt.*;

public class Demo5 {
    public static void main(String[] args) {
        final Frame f = new Frame("Flowlayout");
        f.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));
        f.setSize(400,300);
        f.setLocation(300,200);
        f.add(new Button("第1个按钮"));
        f.add(new Button("第2个按钮"));
        f.add(new Button("第3个按钮"));
        f.add(new Button("第4个按钮"));
        f.add(new Button("第5个按钮"));
        f.add(new Button("第6个按钮"));
        f.setVisible(true);
    }
}
