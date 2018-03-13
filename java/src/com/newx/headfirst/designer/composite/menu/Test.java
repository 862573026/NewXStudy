package com.newx.headfirst.designer.composite.menu;

/**
 * Created by xuzhijian on 2018/2/23 0023.
 */
public class Test {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu =
                new Menu("烤饼", "早餐");
        MenuComponent dinerMenu =
                new Menu("菜单", "午餐");
        MenuComponent cafeMenu =
                new Menu("咖啡", "晚餐");
        MenuComponent dessertMenu =
                new Menu("甜点", "甜点");
        MenuComponent coffeeMenu = new Menu("咖啡", "下午茶");


        MenuComponent allMenus = new Menu("全部菜单","全部菜单");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "K&B's 早餐烤饼",
                "拌鸡蛋、吐司、烤饼",
                true,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "常规早餐烤饼",
                "熟鸡蛋、香肠、烤饼",
                false,
                2.99));
        pancakeHouseMenu.add(new MenuItem(
                "蓝莓烤饼",
                "新鲜蓝莓做的烤饼",
                true,
                3.49));
        pancakeHouseMenu.add(new MenuItem(
                "华夫饼干",
                "华夫饼干，可选草莓味和蓝莓味",
                true,
                3.59));

        dinerMenu.add(new MenuItem(
                "素食 BLT",
                "(Fakin') 腌肉、 生菜、西红柿、全麦",
                true,
                2.99));
        dinerMenu.add(new MenuItem(
                "BLT",
                "腌肉生菜、西红柿、全麦",
                false,
                2.99));
        dinerMenu.add(new MenuItem(
                "例汤",
                "例汤，土豆汤",
                false,
                3.29));
        dinerMenu.add(new MenuItem(
                "热狗",
                "热狗、酸菜、调料、洋葱、顶级奶酪",
                false,
                3.05));
        dinerMenu.add(new MenuItem(
                "熟的蔬菜和大米",
                "熟的蔬菜和大米",
                true,
                3.99));

        dinerMenu.add(new MenuItem(
                "意大利面",
                "Marinara Sauce意大利面和一块面包",
                true,
                3.89));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "苹果派",
                "Apple pie with a flakey crust, topped with vanilla icecream",
                true,
                1.59));

        dessertMenu.add(new MenuItem(
                "奶酪蛋糕",
                "Creamy New York cheesecake, with a chocolate graham crust",
                true,
                1.99));
        dessertMenu.add(new MenuItem(
                "果汁冰糕",
                "A scoop of raspberry and a scoop of lime",
                true,
                1.89));

        cafeMenu.add(new MenuItem(
                "汉堡和薯条",
                "圆全麦面包,生菜,西红柿,薯条",
                true,
                3.99));
        cafeMenu.add(new MenuItem(
                "例汤",
                "例汤，土豆汤",
                false,
                3.69));
        cafeMenu.add(new MenuItem(
                "玉米煎饼",
                "大份玉米煎饼,豆子,辣调味汁,鳄梨色拉酱",
                true,
                4.29));

        cafeMenu.add(coffeeMenu);

        coffeeMenu.add(new MenuItem(
                "咖啡蛋糕",
                "Crumbly cake topped with cinnamon and walnuts",
                true,
                1.59));
        coffeeMenu.add(new MenuItem(
                "百吉饼",
                "Flavors include sesame, poppyseed, cinnamon raisin, pumpkin",
                false,
                0.69));
        coffeeMenu.add(new MenuItem(
                "意大利式脆饼",
                "Three almond or hazelnut biscotti cookies",
                true,
                0.89));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
