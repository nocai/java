package com.liujun.dp.factory_method;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class HumanFactory {

    private static Map<String, Human> humans = new HashMap<String, Human>();

    public static Human createHuman(Class c) {
        Human human = null;
        try {
//            human = (Human) Class.forName(c.getName()).newInstance();
            if (humans.containsKey(c.getSimpleName())) {
                human = humans.get(c.getSimpleName());
            } else {
                human = (Human) Class.forName(c.getName()).newInstance();
                humans.put(c.getSimpleName(), human);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return human;
    }

    public static Human createHuman() {
        List<Class> concreteHumanList = ClassUtils.getAllClassByInterface(Human.class);
        Random r = new Random();
        int i = r.nextInt(concreteHumanList.size());
        return createHuman(concreteHumanList.get(i));
    }
}
