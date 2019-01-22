public class Date {

    //El public/private se llama modificador de acceso. Private es mejor práctica.
    private int day, month, year;

    public void setDay(int day){

        this.day = day;

    }

    public void setMonth(int month){

        //this---> dentro del scope de la clase (El parámetro que le pasas lo pones en this.month).
        this.month = month;

    }

    public void setYear(int year){

        //this---> dentro del scope de la clase (El parámetro que le pasas lo pones en this.month).
        this.year = year;

    }

    public void setDate(String date){

        if(date.length() != 10){

            System.out.println("Formato incorrecto. Ingrese una fecha de 10 dígitos");
            return;
        }

        String[] stringDate = date.split("/");

        this.day = Integer.parseInt(stringDate[0]);
        this.month = Integer.parseInt(stringDate[1]);
        this.year = Integer.parseInt(stringDate[2]);
    }

    public String getDate(){

        return day + "/" + month + "/" + year;
    }

    public int getDay(){

        return day;

    }

    public int getMonth(){

        return month;

    }

    public int getYear(){

        return year;

    }

}
