package Self_Java_Practice;//package org.example;

public class Test3 {
    public static void main(String[] args) {
        int Ramu = 10;
        int Sameer = 27;
        int Imran = 26;
        if(Ramu>Sameer && Ramu<Imran){
            System.out.println("ramu is Elder than Self_Java_Practice.Sameer and Self_Java_Practice.Imran");
        }
        else if (Ramu <Sameer && Ramu<Imran) {
            System.out.println("Ramu is Younger");
        } else if (Sameer>Ramu  && Sameer>Imran) {
            System.out.println("sameer is elder");
        } else if (Sameer<Ramu  && Sameer<Imran) {
            System.out.println("sameer is younger");
        }else if (Imran>Ramu  && Imran>Sameer) {
            System.out.println("Self_Java_Practice.Imran is elder");
        } else if (Imran<Ramu  && Imran<Sameer) {
            System.out.println("Self_Java_Practice.Imran is younger");
        }
    }
}
