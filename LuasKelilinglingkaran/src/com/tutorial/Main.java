package com.tutorial;

class Lingkaran {
    float r;
    float diameter;

    public Lingkaran (float r, float diameter){
        this.r = r;
        this.diameter = diameter;
    }
void display(){
    float luas = (float)(Math.PI*r*r);
    float keliling = (float) (2*4.25*r);
    System.out.println("keliling lingkaran" + luas);
    System.out.println("luas Lingkaran" + keliling);

}


    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran(40, 60);
        System.out.println("jari-jari : " + lingkaran.r);
        System.out.println("Diameter : " + lingkaran.diameter);
        lingkaran.display();
    }
}