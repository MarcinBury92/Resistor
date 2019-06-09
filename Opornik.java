 

//import wykorzystywanych klas
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//klasa Opornik dziedziczy po JFrame, dzieki czemu mamy ramke
public class Opornik extends JFrame {
    
    //deklaracja atrybutów klasy
    JComboBox l1, l2, l3, l4;
    JTextArea ta1, ta2, ta3, ta4;
    JLabel jl1, jl2;
    JButton policz, wyczysc;
    long opor;
    double toler;
    
    //konstruktor klasy, w nim wszystko sie dzieje
    public Opornik(){
         
         //poczatkowe wyzerowanie zmiennych dla bezpieczenstwa
         opor = 0;
         toler = 0;
        
         //tworzenie list
         l1 = new JComboBox();
         l2 = new JComboBox();
         l3 = new JComboBox();
         l4 = new JComboBox();
         
         //tworzenie pol, ktore beda wypelniane kolorami
         ta1 = new JTextArea(20,20);
         ta2 = new JTextArea(20,20);
         ta3 = new JTextArea(20,20);
         ta4 = new JTextArea(20,20);
         
         //ustawienia by te pola nie byly edytowalne
         ta1.setEditable(false);
         ta2.setEditable(false);
         ta3.setEditable(false);
         ta4.setEditable(false);
         
         //tworzenie paneli, na ktorych osadzimy elementy takie jak listy czy przyciski
         JPanel p1 = new JPanel(); //na pierwszym panelu beda listy
         JPanel p2 = new JPanel(); //na drugim panelu beda pola z kolorami
         JPanel p3 = new JPanel(); //na tzecim panelu dwa przyciski i pole z wynikiem
         
         //tworzenie dwoch przyciskow
         policz = new JButton("Policz");
         wyczysc = new JButton("Wyczyść");
         
         //metoda do obslugi nacisniecia przycisku 'Wyczysc' - czysci wartosci atrybutow opor i toler, jesli chcemy zmienic jednak na inny kolor na tej samej liscie
         wyczysc.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                 opor = 0;
                 toler = 0;
                 ta1.setBackground(Color.WHITE);
                 ta2.setBackground(Color.WHITE);
                 ta3.setBackground(Color.WHITE);
                 ta4.setBackground(Color.WHITE);
                 jl2.setText("0");
                 l1.setSelectedIndex(0);
                 l2.setSelectedIndex(0);
                 l3.setSelectedIndex(0);
                 l4.setSelectedIndex(0);
                 JOptionPane.showMessageDialog(null, "Wartości wyczyszczone!");
             }
         });
         
         //metoda do obslugi nacisniecia przycisku 'Policz' - liczy opor i tolerancje
         policz.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                 
                 
                 int i1 = l1.getSelectedIndex(); //pobieram id kliknietego elementu na pierwszej liscie
                 
                 if(i1==0){//jesli kliknieto pierwszy element na liscie
         
                     opor += 10;//i zwiekszam wartosc oporu o 10,  ponizej analogicznie.
                 }
                 if(i1==1){
                    
                     opor += 20;
                 }
                 if(i1==2){
                   
                     opor += 30;
                 }
                 if(i1==3){              //zolty
                  
                     opor += 40;
                 }
                 if(i1==4){
                    
                     opor += 50;
                 }
                 if(i1==5){
                    
                     opor += 60;
                 }
                 if(i1==6){
                     
                     opor += 70;
                 }
                 if(i1==7){
                   
                     opor += 80;
                 }
                 if(i1==8){
                  
                     opor += 90;
                 }
                 
                 
                 
                 int i2 = l2.getSelectedIndex(); //pobieram wybrany kolor z drugiej listy
                 
                 if(i2==0){
                    
                     opor += 0;
                 }
                 if(i2==1){
                    
                     opor += 1;
                 }
                 if(i2==2){
                    
                     opor += 2;
                 }
                 if(i2==3){
                  
                     opor += 3;
                 }
                 if(i2==4){
                   
                     opor += 4;
                 }
                 if(i2==5){
                  
                     opor += 5;
                 }
                 if(i2==6){
                    
                     opor += 6;
                 }
                 if(i2==7){
                   
                     opor += 7;
                 }
                 if(i2==8){
                     
                     opor += 8;
                 }
                 if(i2==9){
                   
                     opor += 9;
                 }
                 
                 
                 
                 int i3 = l3.getSelectedIndex(); //pobieram wybrany kolor z trzeciej listy
                 
                 if(i3==0){
                 
                     opor *= 1;
                 }
                 if(i3==1){
                   
                     opor *= 10;
                 }
                 if(i3==2){
                     
                     opor *= 100;
                 }
                 if(i3==3){
                    
                     opor *= 1000;
                 }
                 if(i3==4){
                    
                     opor *= 10000;
                 }
                 if(i3==5){
                   
                     opor *= 100000;
                 }
                 if(i3==6){
                    
                     opor *= 1000000;
                 }
                 if(i3==7){
                     
                     opor *= 10000000;
                 }
                 if(i3==8){
                    
                     opor *= 100000000;
                 }
                 if(i3==9){
                   
                     opor *= 1000000000;
                 }
                 if(i3==10){
                   
                     opor *= 0.1;
                 }
                 if(i3==11){
                    
                     opor *= 0.01;
                 }
                 

                 int i4 = l4.getSelectedIndex(); //pobieram wybrany kolor z czwartej listy (tolerancja)

                 if(i4==0){
                   
                     toler = 1;
                 }
                 if(i4==1){
                  
                     toler = 2;
                 }
                 if(i4==2){
                    
                     toler = 0.5;
                 }
                 if(i4==3){
                    
                     toler = 0.25;
                 }
                 if(i4==4){
                    
                     toler = 0.1;
                 }
                 if(i4==5){
                     
                     toler = 0.05;
                 }
                 if(i4==6){
                     
                     toler = 5;
                 }
                 if(i4==7){
                     
                     toler = 10;
                 }
                 if(i4==8){
                     
                     toler = 20;
                 }
                 
                 
                 //w metodzie tej sprawdzam jaka wartosc ma aktualnie opornik, by podac poprawna wartosc (ohms, kohms, mohms)
                 String znak = "Ω";
                 double opor2 = opor;
                 
                 if(opor>=1000 && opor < 1000000){
                     znak = "kΩ";
                     opor2 /= 1000;
                 }
                 if(opor>=1000000 && opor < 100000000){
                     znak = "MΩ";
                     opor2 /= 1000000;
                 }
                 if(opor>=100000000){
                     znak = "GΩ";
                     opor2 /= 100000000;
                 }
                 
                 jl2.setText(opor2 + " " + znak + " +/- " + toler + "%"); //wstawienie wyniku do pola tekstowego
                 //po wyliczeniu wyzerowanie zmiennych dla nastepnych obliczen
                 opor = 0;
                 toler = 0;
             }
         });
         
         
         //obsługa klikniecia na element na pierwszej liscie (jak kliknieto to ustawiamy odpowiedni kolor tla)
         l1.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                 int i1 = l1.getSelectedIndex(); //pobieram id kliknietego elementu na liscie
                 
                 if(i1==0){//jesli kliknieto pierwszy element na liscie
                     ta1.setBackground(new Color(102, 51, 0));//to ustawiam tlo dla pierwszego pola na brazowy

                 }
                 if(i1==1){
                     ta1.setBackground(Color.RED);
 
                 }
                 if(i1==2){
                     ta1.setBackground(Color.ORANGE);
 
                 }
                 if(i1==3){
                     ta1.setBackground(Color.YELLOW);
   
                 }
                 if(i1==4){
                     ta1.setBackground(Color.GREEN);

                 }
                 if(i1==5){
                     ta1.setBackground(Color.BLUE);

                 }
                 if(i1==6){
                     ta1.setBackground(Color.MAGENTA);
     
                 }
                 if(i1==7){
                     ta1.setBackground(Color.GRAY);
   
                 }
                 if(i1==8){
                     ta1.setBackground(Color.WHITE);
      
                 }
             }
         });
         
         //obsługa klikniecia na element na drugiej liscie (jak kliknieto to ustawiamy odpowiedni kolor tla)
         l2.addActionListener(new ActionListener() {

             @Override
             public void actionPerformed(ActionEvent ae) {
                 int i2 = l2.getSelectedIndex();
                 
                 if(i2==0){
                     ta2.setBackground(Color.BLACK);

                 }
                 if(i2==1){
                     ta2.setBackground(new Color(102, 51, 0));
        
                 }
                 if(i2==2){
                     ta2.setBackground(Color.RED);
       
                 }
                 if(i2==3){
                     ta2.setBackground(Color.ORANGE);
      
                 }
                 if(i2==4){
                     ta2.setBackground(Color.YELLOW);
   
                 }
                 if(i2==5){
                     ta2.setBackground(Color.GREEN);
        
                 }
                 if(i2==6){
                     ta2.setBackground(Color.BLUE);

                 }
                 if(i2==7){
                     ta2.setBackground(Color.MAGENTA);
            
                 }
                 if(i2==8){
                     ta2.setBackground(Color.GRAY);
           
                 }
                 if(i2==9){
                     ta2.setBackground(Color.WHITE);
            
                 }
             }
         });
         
         //obsługa klikniecia na element na trzeciej liscie (jak kliknieto to ustawiamy odpowiedni kolor tla)
         l3.addActionListener(new ActionListener(){
             @Override
             public void actionPerformed(ActionEvent ae){
                 int i3 = l3.getSelectedIndex();
                 
                 if(i3==0){
                     ta3.setBackground(Color.BLACK);
            
                 }
                 if(i3==1){
                     ta3.setBackground(new Color(102, 51, 0));
                  
                 }
                 if(i3==2){
                     ta3.setBackground(Color.RED);
                
                 }
                 if(i3==3){
                     ta3.setBackground(Color.ORANGE);
                
                 }
                 if(i3==4){
                     ta3.setBackground(Color.YELLOW);
                 
                 }
                 if(i3==5){
                     ta3.setBackground(Color.GREEN);
                  
                 }
                 if(i3==6){
                     ta3.setBackground(Color.BLUE);
                   
                 }
                 if(i3==7){
                     ta3.setBackground(Color.MAGENTA);
                  
                 }
                 if(i3==8){
                     ta3.setBackground(Color.GRAY);
                   
                 }
                 if(i3==9){
                     ta3.setBackground(Color.WHITE);
                   
                 }
                 if(i3==10){
                     ta3.setBackground(new Color(255, 215, 0));
                
                 }
                 if(i3==11){
                     ta3.setBackground(new Color(204, 204, 204));
                  
                 }
             }
         });
         
         //obsługa klikniecia na element na czwartej liscie (jak kliknieto to ustawiamy odpowiedni kolor tla)
         l4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                int i4 = l4.getSelectedIndex();

                 if(i4==0){
                     ta4.setBackground(new Color(102, 51, 0));
                  
                 }
                 if(i4==1){
                     ta4.setBackground(Color.RED);
                  
                 }
                 if(i4==2){
                     ta4.setBackground(Color.GREEN);
                    
                 }
                 if(i4==3){
                     ta4.setBackground(Color.BLUE);
              
                 }
                 if(i4==4){
                     ta4.setBackground(Color.CYAN);
                 
                 }
                 if(i4==5){
                     ta4.setBackground(Color.GRAY);
                 
                 }
                 if(i4==6){
                     ta4.setBackground(new Color(255, 215, 0));
                  
                 }
                 if(i4==7){
                     ta4.setBackground(new Color(204, 204, 204));
               
                 }
                 if(i4==8){
                     ta4.setBackground(Color.WHITE);
                
                 }
            }
         });
         
         //tworzenie pol tekstowych z wynikiem
         jl1 = new JLabel("  Wynik: ");
         jl2 = new JLabel("0");
 
         //ustawienie czcionki na tych dwoch polach tekstowych
         jl1.setFont(new Font("Arial", Font.BOLD+Font.ITALIC, 16));
         jl2.setFont(new Font("Arial", Font.BOLD, 14));
         
         //wypelnienie pierwszej listy wartosciami
         l1.addItem("brązowy");
         l1.addItem("czerwony");
         l1.addItem("pomarańczowy");
         l1.addItem("żółty");
         l1.addItem("zielony");
         l1.addItem("niebieski");
         l1.addItem("fioletowy");
         l1.addItem("szary");
         l1.addItem("biały");
         
         //wypelnienie drugiej listy wartosciami
         l2.addItem("czarny");
         l2.addItem("brązowy");
         l2.addItem("czerwony");
         l2.addItem("pomarańczowy");
         l2.addItem("żółty");
         l2.addItem("zielony");
         l2.addItem("niebieski");
         l2.addItem("fioletowy");
         l2.addItem("szary");
         l2.addItem("biały");
         
         //wypelnienie trzeciej listy wartosciami
         l3.addItem("czarny");
         l3.addItem("brązowy");
         l3.addItem("czerwony");
         l3.addItem("pomarańczowy");
         l3.addItem("żółty");
         l3.addItem("zielony");
         l3.addItem("niebieski");
         l3.addItem("fioletowy");
         l3.addItem("szary");
         l3.addItem("biały");
         l3.addItem("złoty");
         l3.addItem("srebrny");
         
         //wypelnienie czwartej listy wartosciami
         l4.addItem("brązowy");
         l4.addItem("czerwony");
         l4.addItem("zielony");
         l4.addItem("niebieski");
         l4.addItem("fioletowy");
         l4.addItem("szary");
         l4.addItem("złoty");
         l4.addItem("srebrny");
         l4.addItem("brak");
         
         //ustawienie layoutu dla ramki
         setLayout(new BorderLayout());
         //ustawienie layoutu dla 4 list (1 wiersz, 4 kolumny)
         p1.setLayout(new GridLayout(1,4));
         //ustawienie layoutu dla panelu z kolorami (1 wiersz, 4 kolumny)
         p2.setLayout(new GridLayout(1,4));
         //ustawienie layoutu dla panelu z przyciskami i polami tekstowymi (1 wiersz, 4 kolumny)
         p3.setLayout(new GridLayout(1,4));
         
         //dodanie 4 list do 1 panelu
         p1.add(l1);
         p1.add(l2);
         p1.add(l3);
         p1.add(l4);
         
         //dodanie 4 pol do 2 panelu
         p2.add(ta1);
         p2.add(ta2);
         p2.add(ta3);
         p2.add(ta4);       
         
         //dodanie 2 przyciskow i 2 pol tekstowych do 3 panelu
         p3.add(wyczysc);
         p3.add(policz);
         p3.add(jl1);
         p3.add(jl2);      
         
         //dodanie 3 paneli do ramki
         add(p1, BorderLayout.NORTH);
         add(p2);
         add(p3, BorderLayout.SOUTH);
         
         //ustawienia ramki
         setDefaultCloseOperation(EXIT_ON_CLOSE); //podczas kliknięcia X program ma się zamknąć
         setLocation(400, 100); //ustawienie lokacji okna
         setSize(690, 160); //ustawienie rozmiaru edytora
         setTitle("Opornik"); //tytuł okna
         setResizable(false); //blokada zmiany wielkosci okna
         setVisible(true); //ustawienie widoczności (bez tego sie nie pokaze okienko)

    }
    
}
