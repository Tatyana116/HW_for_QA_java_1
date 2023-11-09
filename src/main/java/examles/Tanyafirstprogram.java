package examles;

public class Tanyafirstprogram {

    public static void main(String[] args){
        // Объявляем типы данных
            byte aByte = 120;
            byte bByte = 10;
            byte cByte = 126;
            short aShort = 150;
            short bShort = 99;
            short cShort = 32767;
            int aInt = 1001;
            int bInt = 15067;
            long aLong = 2013456;

            //арифметические операции
            System.out.println("aByte + bByte = " + (aByte + bByte));
            System.out.println("aShort - bShort = " + (aShort - bShort));
            System.out.println("bInt / aInt = " + (bInt / aInt));
            System.out.println("bInt % aInt = " + (bInt % aInt));
            System.out.println("aLong++ = " + ++aLong);

            boolean aBoolean = true;
            boolean bBoolean = false;

            //логические операции
            System.out.println("aBoolean && bBoolean = " + (aBoolean && bBoolean));
            System.out.println("aBoolean || bBoolean = " + (aBoolean || bBoolean));
            System.out.println("!(aBoolean && bBoolean) = " + !(aBoolean && bBoolean));

            //переполнение при вычислениях
            System.out.println("cByte + bByte = " + (byte)(cByte + bByte)); //неожидаемый результат
            System.out.println("aByte + bByte + cByte = "+ (aByte + bByte + cByte)); //ответ приводится к следующему типу short
            System.out.println("cShort * aShort * bShort = " +(short)(cShort * aShort * bShort)); //неожидаемый результат
            System.out.println("cShort * aShort * bShort = " +(cShort * aShort * bShort)); //ответ приводится к следующему типу int

            float aFloat = 1.1f;
            double aDouble = 1.2;


            //вычисления разных комбинаций типов данных
            System.out.println("aInt + aFloat = " + aInt + aFloat); //ответ приводится к следующему типу float
            System.out.println("bInt * aDouble = " + bInt * aDouble); //ответ приводится к следующему типу double

    }
}