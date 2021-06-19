
package caclculator;

interface Calculations {
    public void add(double a, double b);
    public void sub(double a, double b);
    public void divide(double a, double b);
    public void mul(double a, double b);
}

public class Caclculator extends javax.swing.JFrame implements Calculations{

    public Caclculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        tf1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bsqrt = new javax.swing.JButton();
        bsquare = new javax.swing.JButton();
        b1byx = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bmulti = new javax.swing.JButton();
        bprct = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bplusm = new javax.swing.JButton();
        bminus = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bdecimal = new javax.swing.JButton();
        bplus = new javax.swing.JButton();
        bequalto = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        bdivide = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bc = new javax.swing.JButton();
        bce = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        tf1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tf1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tf1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CALCULATOR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        bsqrt.setBackground(new java.awt.Color(255, 255, 255));
        bsqrt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bsqrt.setText("sqrt");
        bsqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsqrtActionPerformed(evt);
            }
        });

        bsquare.setBackground(new java.awt.Color(255, 255, 255));
        bsquare.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bsquare.setText("x^2");
        bsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsquareActionPerformed(evt);
            }
        });

        b1byx.setBackground(new java.awt.Color(255, 255, 255));
        b1byx.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1byx.setText("1/x");
        b1byx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1byxActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b8.setText("8");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bmulti.setBackground(new java.awt.Color(255, 255, 255));
        bmulti.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bmulti.setText("*");
        bmulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultiActionPerformed(evt);
            }
        });

        bprct.setBackground(new java.awt.Color(255, 255, 255));
        bprct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bprct.setText("%");
        bprct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprctActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        bplusm.setBackground(new java.awt.Color(255, 255, 255));
        bplusm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bplusm.setText("+-");
        bplusm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusmActionPerformed(evt);
            }
        });

        bminus.setBackground(new java.awt.Color(255, 255, 255));
        bminus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bminus.setText("-");
        bminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bminusActionPerformed(evt);
            }
        });

        b0.setBackground(new java.awt.Color(255, 255, 255));
        b0.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        bdecimal.setBackground(new java.awt.Color(255, 255, 255));
        bdecimal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bdecimal.setText(".");
        bdecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdecimalActionPerformed(evt);
            }
        });

        bplus.setBackground(new java.awt.Color(255, 255, 255));
        bplus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bplus.setText("+");
        bplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bplusActionPerformed(evt);
            }
        });

        bequalto.setBackground(new java.awt.Color(255, 255, 255));
        bequalto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bequalto.setText("=");
        bequalto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bequaltoActionPerformed(evt);
            }
        });

        lb1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        bdivide.setBackground(new java.awt.Color(255, 255, 255));
        bdivide.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bdivide.setText("/");
        bdivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivideActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("<--");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bc.setBackground(new java.awt.Color(255, 255, 255));
        bc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bc.setText("C");
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });

        bce.setBackground(new java.awt.Color(255, 255, 255));
        bce.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bce.setText("CE");
        bce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tf1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(bprct, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bsquare, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b1byx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bplusm, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bce, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bdecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bequalto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bplus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bdivide, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bprct, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsquare, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1byx, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bdivide, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bce, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bmulti, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bminus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bplus, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bplusm, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bequalto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void bsquareActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if(tf1.getText().length()>0){
            valutocal=Double.parseDouble(tf1.getText());
            tf1.setText(Double.toString(valutocal*valutocal));
        }
    }                                       

    private void b1byxActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(tf1.getText().length()>0){
            valutocal=Double.parseDouble(tf1.getText());
            tf1.setText(Double.toString(1/valutocal));
        }
    }                                     

    private void bplusActionPerformed(java.awt.event.ActionEvent evt) {                                      
        sign="+";
        if(tf1.getText().length()>0)
        //valutocal=Double.parseDouble(tf1.getText());
        storeToBeCalculatedvalue(sign);
    }                                     

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"1");
    }                                  

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"2");
    }                                  

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"3");
    }                                  

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"4");
    }                                  

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"5");
    }                                  

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"6");
    }                                  

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"7");
    }                                  

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"8");
    }                                  

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"9");
    }                                  

    private void bdecimalActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(!isDecimal){
            tf1.setText(tf1.getText()+".");
            isDecimal=true;
        }
    }                                        

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText(tf1.getText()+"0");
    }                                  

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {                                   
        tf1.setText("");
        lb1.setText("");
    }                                  

    private void bceActionPerformed(java.awt.event.ActionEvent evt) {                                    
        tf1.setText("");
    }                                   

    private void bplusmActionPerformed(java.awt.event.ActionEvent evt) {                                       
        String s= tf1.getText();
        if(!s.contains("-")){
            tf1.setText("-"+s);
        }
        else{
           try{ tf1.setText(s.split("-")[1]);}
           catch(IndexOutOfBoundsException e){
                 tf1.setText("");
           }
        }
    }                                      

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int length = tf1.getText().length();
        String value= tf1.getText();
        if(length>0){
            StringBuilder b= new StringBuilder(value);
            b.deleteCharAt(length-1);
            tf1.setText(b.toString());
         }
    }                                        

    private void bequaltoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if(tf1.getText().length()>0){
            double b= Double.parseDouble(tf1.getText());
            switch (sign){
                case"+": 
                    add(valutocal,b);
                    break;
                case"-":
                    sub(valutocal,b);
                    break;
                case"*":
                    mul(valutocal,b);
                    break;
                case"/":
                    divide(valutocal,b);
                    break;
            }
        }        
    }                                        

    private void bdivideActionPerformed(java.awt.event.ActionEvent evt) {                                        
        sign="/";
        if(tf1.getText().length()>0)
        //valutocal=Double.parseDouble(tf1.getText());
        storeToBeCalculatedvalue(sign);
    }                                       

    private void bmultiActionPerformed(java.awt.event.ActionEvent evt) {                                       
        sign="*";
        if(tf1.getText().length()>0)
       // valutocal=Double.parseDouble(tf1.getText());
        storeToBeCalculatedvalue(sign);
    }                                      

    private void bminusActionPerformed(java.awt.event.ActionEvent evt) {                                       
        sign="-";
        if(tf1.getText().length()>0)
        //valutocal=Double.parseDouble(tf1.getText());
        storeToBeCalculatedvalue(sign);
    }                                      

    private void bprctActionPerformed(java.awt.event.ActionEvent evt) {                                      
        if(lb1.getText().length()>0 && tf1.getText().length()>0){
            valutocal=Double.parseDouble(tf1.getText());
            percentage(Double.parseDouble(lb1.getText().split(" ")[0]),valutocal);
        }
    }                                     

    private void bsqrtActionPerformed(java.awt.event.ActionEvent evt) {                                      
       if(tf1.getText().length()>0){
           valutocal= Double.parseDouble(tf1.getText());
           double res=Math.sqrt(valutocal);
           tf1.setText(Double.toString(res));
       }
    }                                     

    @Override
    public void add(double a, double b){
        setResult(a+b);
    }
    
    @Override
    public void sub(double a, double b){
        setResult(a-b);
    }
    
    @Override
    public void mul(double a, double b){
        setResult(a*b);
    }
    
    @Override
    public void divide(double a, double b){
        setResult(a/b);
    }
    
    private void percentage(double a, double b){
        switch(sign){
            case"+":
                add(((a/100)*b),a);
                break;
            case"-":
                sub(((a/100)*b),a);
                break;
            case"*":
                mul(((a/100)*b),a);
                break;
            case"/":
                divide(((a/100)*b),a);
                break;
        }
    }
    
    private void setResult(double s){
        tf1.setText(Double.toString(s));
        lb1.setText("");
    }
    
    private void storeToBeCalculatedvalue(String sign){
        String s= tf1.getText();
        valutocal=Double.parseDouble(s);
        lb1.setText(s+" "+sign);
        tf1.setText("");
    }
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caclculator().setVisible(true);
            }
        });
    }
    private String sign;
    private boolean isDecimal=false;
    private double valutocal;
    // Variables declaration - do not modify                     
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b1byx;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bc;
    private javax.swing.JButton bce;
    private javax.swing.JButton bdecimal;
    private javax.swing.JButton bdivide;
    private javax.swing.JButton bequalto;
    private javax.swing.JButton bminus;
    private javax.swing.JButton bmulti;
    private javax.swing.JButton bplus;
    private javax.swing.JButton bplusm;
    private javax.swing.JButton bprct;
    private javax.swing.JButton bsqrt;
    private javax.swing.JButton bsquare;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lb1;
    private javax.swing.JTextField tf1;
    // End of variables declaration     
}
 
