package Vehicles;

public class Vehicle
{
    int id;
    String name;
    double acceleration;
    double top_speed;
    double aggressivity;
    double reflex;
    double length;

    public Vehicle(int id, String name, double acceleration, double top_speed, double aggressivity, double reflex, double length)
    {
        this.id = id;
        this.name = name;
        this.acceleration = acceleration;
        this.top_speed = top_speed;
        this.aggressivity = aggressivity;
        this.reflex = reflex;
        this.length = length;
    }

    public Vehicle()
    {
    }
}
