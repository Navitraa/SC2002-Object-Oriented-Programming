#ifndef ANIMAL_H
#define ANIMAL_H
#include <iostream>
#include <string>

using namespace std;
enum COLOR {
    Green, Blue, White, Black, Brown
};

class Animal {
public :
    Animal();
    Animal(string n, COLOR c);
    ~Animal();
    virtual void speak() const;
    virtual void move() = 0;

private :
    string _name;
    COLOR _color;
};

class Mammal : public Animal{
private:
    string owner;
public:
    Mammal();
    Mammal(string n, COLOR c);
    ~Mammal();
    void move();
    void eat() const;
};
#endif