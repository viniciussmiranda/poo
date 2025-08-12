package Retangulo;
public class Retangulo {
    int largura;
    int comprimento;
    int area;

    Retangulo(int l, int c){
        largura = l;
        comprimento = c;
    }

    int area() {
        return (comprimento * largura);
        }
    };