import byJins.abstractFactory.*;
import byJins.adapter.ILedFramework;
import byJins.adapter.LedFrameworkAdapter;
import byJins.strategy.MergeSort;
import byJins.strategy.QuickSort;
import byJins.strategy.Sort;
import byJins.strategy.SortEngine;
import headFirst.duck.*;

public class Main {

    public static void main(String[] args) {

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPower());
        modelDuck.performFly();
        /*MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();
        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();*/
        /**
         * 싱글톤 패턴
         */
        /*SystemSpeaker ss1 = SystemSpeaker.getInstance();

        SystemSpeaker ss2 = SystemSpeaker.getInstance();

        System.out.println(ss1);
        System.out.println(ss2);


        System.out.println(ss1.systemVol);
        System.out.println(ss2.systemVol);
        ss1.systemVol--;
        System.out.println(ss1.systemVol);
        System.out.println(ss2.systemVol);*/

        /**
         * 전략 패턴
         */
        /*SortEngine se;

        Sort sort = new QuickSort();

        se = new SortEngine(sort);
        se.search();
        System.out.println("===========================");
        sort = new MergeSort();
        se = new SortEngine(sort);
        se.search();*/

        /**
         *  팩토리 패턴
         */
        /*//교통수단을 만들어내는 생성자 선언
        TransCreator tc = new RealTransCreatorTransCompany();

        //main은 callee를 직접변수를 선언하지 않고 생성.
        //항상 인터페이스(중간매체, 추상클래스포함)을 통해 생성.

        TransProduct tp;
        //교통수단 - 자전거 생성
        tp = tc.transCreate("bicycle");

        // 자전거 이용;
        tp.useTrans();

        //교통수단 - 택시 생성
        tp = tc.transCreate("taxi");

        //택시 이용
        tp.useTrans();*/

        /**
         * 어댑터 패턴
         */
        /*ILedFramework led = new LedFrameworkAdapter();

        led.ledOn("RED");
        led.ledOn("BLUE");
        led.ledOn("GREEN");

        led.ledBlink("RED");*/

        /**
         * 추상 팩토리 패턴
         */
        /*AbstractFactory af;
        af = new KoreaFactory();
        HamProduct ham;
        BreadProduct bread;

        bread = af.createBread();
        ham = af.createHam();
        ham.fromTaste();
        bread.fromTaste();

        af = new StateFactory();
        bread = af.createBread();
        ham = af.createHam();
        ham.fromTaste();
        bread.fromTaste();
*/

    }
}
