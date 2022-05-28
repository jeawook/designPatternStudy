package headfirst.designpatterns.decorator.pizza;

public class NYStylePepperoniPizza extends Pizza{

    public NYStylePepperoniPizza() {
        name = "뉴욕 스타일 소스와 치즈피자";
        dough = "인 크러스트 도우";
        sauce = "마리나라 소스";

        toppings.add("길게 썬 레지아노 치즈");
    }
}
