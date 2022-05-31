package bookshopproject;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//package currency_converter;

public class myconverter extends javax.swing.JFrame {
    

    String[] currencyUnits = {
        "units",
        "US Dollar",
        "Nigerian Naira",
        "Brazilian Real",
        "Canadian Dollar",
        "Kenyan Shilling",
        "Indian Rupee",
        "Philippine Pisco",
        "Pakistani Rupee",
        "Bangladesi Taka"
    };
    double us_Dollar ;
    double Nigerian_Naira = 437.10;
    double Brazilian_Real ;
    double Canadian_Dollar ;
    double Kenyan_Shilling = 125.01;
    double Indian_Rupee ;
    double Philippine_Pisco ;
    double Pakistani_Rupee = 193.60;
    double Bangladesi_Taka = 101.89;

    public myconverter() {
        initComponents();
           t1.addKeyListener(new KeyAdapter() {
    @Override
    public void keyTyped(KeyEvent e) {
        char ch = e.getKeyChar();

        if (!isNumber(ch)) {
            e.consume();
        }
    }

            private boolean isNumber(char ch) {
                  return ch >= '.' && ch <= '9';   
            }
     

        
        });
              int i;
    try {
            URL url = new URL("https://api.exchangeratesapi.io/latest");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");


            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            int num=0;
            int j;
            us_Dollar=0.0;
   
            int count=0;
            for(i=0;i<content.length();i++)
            {
                if(content.charAt(i)=='"'&&content.charAt(i+1)=='U'&content.charAt(i+2)=='S'&&content.charAt(i+3)=='D')
                {
              for(j=i+8;j>=i+6;j=j-2)
              {
                  
             us_Dollar=us_Dollar+(Double.valueOf(content.charAt(j))-'0')*Math.pow(10,count);
             count++;
           
              }
                us_Dollar=us_Dollar/10.0;
                }
            }
        } catch(Exception e) {

        }
     try {
            URL url = new URL("https://api.exchangeratesapi.io/latest");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");


            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            int num=0;
            int j;
           Brazilian_Real=0.0;
   
            int count=0;
            for(i=0;i<content.length();i++)
            {
                if(content.charAt(i)=='"'&&content.charAt(i+1)=='B'&content.charAt(i+2)=='R'&&content.charAt(i+3)=='L')
                {
              for(j=i+8;j>=i+6;j=j-2)
              {
                  
            Brazilian_Real=Brazilian_Real+(Double.valueOf(content.charAt(j))-'0')*Math.pow(10,count);
             count++;
             
              }
                  Brazilian_Real=Brazilian_Real/10.0;
                  break;
                }
            }
        } catch(Exception e) {

        }
      try {
            URL url = new URL("https://api.exchangeratesapi.io/latest");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");


            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            int num=0;
            int j;
           Canadian_Dollar=0.0;
   
            int count=0;
            for(i=0;i<content.length();i++)
            {
                if(content.charAt(i)=='"'&&content.charAt(i+1)=='C'&content.charAt(i+2)=='A'&&content.charAt(i+3)=='D')
                {
              for(j=i+8;j>=i+6;j=j-2)
              {
                  
            Canadian_Dollar=Canadian_Dollar+(Double.valueOf(content.charAt(j))-'0')*Math.pow(10,count);
             count++;
             
              }
                  Canadian_Dollar=Canadian_Dollar/10.0;
                    break;
                }
            }
        } catch(Exception e) {

        }
      
          
    try {
            URL url = new URL("https://api.exchangeratesapi.io/latest");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");


            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            int num=0;
            int j;
            Philippine_Pisco=0.0;
   
            int count=0;
            for(i=0;i<content.length();i++)
            {
                if(content.charAt(i)=='"'&&content.charAt(i+1)=='P'&content.charAt(i+2)=='H'&&content.charAt(i+3)=='P')
                {
                     for(j=i+9;j>=i+6;j--)
                    {
                         if(content.charAt(j)!='.')
                        {
                           Philippine_Pisco=Philippine_Pisco+(Double.valueOf(content.charAt(j))-'0')*Math.pow(10,count);
                              count++;
             
                        }
                    }
                         Philippine_Pisco=Philippine_Pisco/10;
                          break;
                 }
            }
        } catch(Exception e) {

        }
      try {
            URL url = new URL("https://api.exchangeratesapi.io/latest");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");


            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }

            in.close();
            int num=0;
            int j;
          Indian_Rupee=0.0;
   
            int count=0;
            for(i=0;i<content.length();i++)
            {
                if(content.charAt(i)=='"'&&content.charAt(i+1)=='I'&content.charAt(i+2)=='N'&&content.charAt(i+3)=='R')
                {
                     for(j=i+9;j>=i+6;j--)
                    {
                         if(content.charAt(j)!='.')
                        {
                          Indian_Rupee=Indian_Rupee+(Double.valueOf(content.charAt(j))-'0')*Math.pow(10,count);
                              count++;
             
                        }
                    }
                        Indian_Rupee=Indian_Rupee/10;
                          break;
                 }
            }
        } catch(Exception e) {

        }
    
    
       
        
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        firstCountry = new javax.swing.JComboBox<String>();
        secondCountry = new javax.swing.JComboBox<String>();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        firstCurrencyUnit = new javax.swing.JLabel();
        secondCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CurrencyConverter");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("From currency of");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("To currency of");

        firstCountry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        firstCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "India", "Philippine", "Pakistan", "Bangladesh" }));
        firstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                firstCountryItemStateChanged(evt);
            }
        });
        firstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstCountryActionPerformed(evt);
            }
        });

        secondCountry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        secondCountry.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose one", "USA", "Nigeria", "Brazil", "Canada", "Kenyan", "India", "Philippine", "Pakistan", "Bangladesh" }));
        secondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                secondCountryItemStateChanged(evt);
            }
        });

        t1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        firstCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        firstCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstCurrencyUnit.setText("unit");

        secondCurrencyUnit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        secondCurrencyUnit.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        secondCurrencyUnit.setText("unit");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Convert currency");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t2)
                            .addComponent(secondCurrencyUnit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secondCountry, 0, 248, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(150, 150, 150))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(secondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstCurrencyUnit)
                    .addComponent(secondCurrencyUnit))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstCountryActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void firstCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_firstCountryItemStateChanged

        int position = firstCountry.getSelectedIndex();
        firstCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_firstCountryItemStateChanged

    private void secondCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_secondCountryItemStateChanged
        int position = secondCountry.getSelectedIndex();
        secondCurrencyUnit.setText(currencyUnits[position]);
    }//GEN-LAST:event_secondCountryItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //for exit
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //convert currency
        double amountToChange = Double.parseDouble(t1.getText());
        double amountInPounds = 0.0;
        double amountChanged = 0.0;
        
        switch (firstCountry.getSelectedItem().toString()) {
            case "USA":
                amountInPounds = amountToChange / us_Dollar;
                break;
            case "Nigeria":
                amountInPounds = amountToChange / Nigerian_Naira;
                break;
            case "Brazil":
                amountInPounds = amountToChange / Brazilian_Real;
                break;
            case "Canada":
                amountInPounds = amountToChange / Canadian_Dollar;
                break;
            case "Kenyan":
                amountInPounds = amountToChange / Kenyan_Shilling;
                break;
            case "India":
                amountInPounds = amountToChange / Indian_Rupee;
                break;
            case "Pakistan":
                amountInPounds = amountToChange / Pakistani_Rupee;
                break;
            case "Philippine":
                amountInPounds = amountToChange / Philippine_Pisco;
                break;
            case "Bangladesh":
                amountInPounds = amountToChange / Bangladesi_Taka;
                break;
            default:
                amountInPounds = 0.0;


    }//GEN-LAST:event_jButton1ActionPerformed

        switch (secondCountry.getSelectedItem().toString()) {
            case "India":
                amountChanged = amountInPounds * Indian_Rupee;
                break;
            case "USA":
                amountChanged = amountInPounds * us_Dollar;
                break;
            case "Nigeria":
                amountChanged = amountInPounds * Nigerian_Naira;
                break;
            case "Brazil":
                amountChanged = amountInPounds * Brazilian_Real;
                break;
            case "Canada":
                amountChanged = amountInPounds * Canadian_Dollar;
                break;
            case "Kenyan":
                amountChanged = amountInPounds * Kenyan_Shilling;
                break;
            case "Pakistan":
                amountChanged = amountInPounds * Pakistani_Rupee;
                break;
            case "Philippine":
                amountChanged = amountInPounds * Philippine_Pisco;
                break;
            case "Bangladesh":
                amountChanged = amountInPounds * Bangladesi_Taka;
                break;
            default:
             amountChanged = amountInPounds * 0.0;
        }

        String value = String.format("%.2f", amountChanged);
        t2.setText(value);
    }
      private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       firstCountry.setSelectedIndex(0);
       secondCountry.setSelectedIndex(0);
       t1.setText(null);
       t2.setText(null);
    }                          

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new myconverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> firstCountry;
    private javax.swing.JLabel firstCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> secondCountry;
    private javax.swing.JLabel secondCurrencyUnit;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
