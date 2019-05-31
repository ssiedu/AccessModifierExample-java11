package p2;

import p1.Main;

public class NonChildOutsidePkg {

    public void disp(){
        Main ob=new Main();
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);
        System.out.println(ob.d);
    }
}
