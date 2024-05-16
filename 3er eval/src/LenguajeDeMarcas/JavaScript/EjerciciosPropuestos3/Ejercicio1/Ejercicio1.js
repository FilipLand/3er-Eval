var farenheit,celsius;
var s="";
 for(i=-2; i<=12; i++)
{
    celsius= 10 * i;
    farenheit = 32 + (celsius * 9) /5 ;
    s = s+ " c = "+ celsius +" // f = "+ farenheit  +"\n";
    if (celsius==0) s = s + "punto congelación del agua\n";
    if (celsius==100) s = s +"punto de ebullición del agua\n"; 
}
alert(s);