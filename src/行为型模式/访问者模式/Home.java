package 行为型模式.访问者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wwh
 * @ProjectName design_pattern
 * @dateTime 2024/4/26 下午9:36
 * @description 对象结构
 **/
public class Home {
    private List<Animal> animals;

    public Home(){
        animals = new ArrayList<>();
    }

    public void action(Person person){
        for (Animal animal : animals) {
            animal.accept(person);
        }
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
}
