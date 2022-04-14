package com.capgemini.pack;

import java.io.*;

class SerializableExample implements java.io.Serializable
{
    public int a;
    public String b;
    // Default constructor
    public SerializableExample(int a, String b)
    {
        this.a = a;
        this.b = b;
    }
}
class Test1
{
    public static void main(String[] args)
    {
        SerializableExample object = new SerializableExample(1, "Harshada");
        String filename = "file.ser";
        // Serialization
        try
        {
            //Saving of object in hello file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            // Method for serialization of object
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        SerializableExample object1 = null;
        // Deserialization
        try
        {
            // Reading the object from hello file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            // Method for deserialization of object
            object1 = (SerializableExample)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
            System.out.println("hello = " + object1.a);
            System.out.println("b = " + object1.b);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}

