package web.Dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{

    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("Car #1",  2001, 1000000));
        carList.add(new Car("Car #2",  2002, 2000000));
        carList.add(new Car("Car #3", 2003, 3000000));
        carList.add(new Car("Car #4", 2004, 4000000));
        carList.add(new Car("Car #5", 2005, 5000000));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
