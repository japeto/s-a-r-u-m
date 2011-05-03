package Interfaz;
import Logica.SarumParadas;
import Logica.SarumRutas;
import java.awt.Point;
import java.util.*;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
/*
 * VentanaInfo.java
 *
 * Created on 29/04/2011, 01:47:02 PM
 */
/**
 * Interfaz grafica de la aplicaciion
 * @author  Miguel Mondragon 
 * @since  1.0
 */
public class VentanaInfo extends javax.swing.JDialog {

    /** Creates new form VentanaInfo */
    public VentanaInfo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocation(new Point(parent.getLocation().x+parent.getWidth(),parent.getLocation().y));
        try{
           UIManager.setLookAndFeel("de.muntjak.tinylookandfeel.TinyLookAndFeel");
           SwingUtilities.updateComponentTreeUI(this);
        }catch (Exception e){
                e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabPnlInformacion = new javax.swing.JTabbedPane();
        pnlArchivo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArchivoMapa = new javax.swing.JEditorPane();
        pnlProblema = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArchivoProblema = new javax.swing.JEditorPane();
        pnlSolucion = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArchivoSolucion = new javax.swing.JEditorPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        editorVentana = new javax.swing.JEditorPane();

        setTitle("Informacion sarum");
        setIconImage(null);
        setResizable(false);

        tabPnlInformacion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabPnlInformacion.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        tabPnlInformacion.setToolTipText("carga de datos");
        tabPnlInformacion.setFont(new java.awt.Font("Arial", 0, 10));

        txtArchivoMapa.setContentType("text/html");
        txtArchivoMapa.setFocusable(false);
        txtArchivoMapa.setOpaque(false);
        txtArchivoMapa.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(txtArchivoMapa);
        txtArchivoMapa.getAccessibleContext().setAccessibleDescription("text/html");

        javax.swing.GroupLayout pnlArchivoLayout = new javax.swing.GroupLayout(pnlArchivo);
        pnlArchivo.setLayout(pnlArchivoLayout);
        pnlArchivoLayout.setHorizontalGroup(
            pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        pnlArchivoLayout.setVerticalGroup(
            pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );

        tabPnlInformacion.addTab("Archivo", pnlArchivo);

        txtArchivoProblema.setContentType("text/html");
        txtArchivoProblema.setOpaque(false);
        txtArchivoProblema.setRequestFocusEnabled(false);
        jScrollPane3.setViewportView(txtArchivoProblema);

        javax.swing.GroupLayout pnlProblemaLayout = new javax.swing.GroupLayout(pnlProblema);
        pnlProblema.setLayout(pnlProblemaLayout);
        pnlProblemaLayout.setHorizontalGroup(
            pnlProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        pnlProblemaLayout.setVerticalGroup(
            pnlProblemaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );

        tabPnlInformacion.addTab("Problema", pnlProblema);

        txtArchivoSolucion.setContentType("text/html");
        txtArchivoSolucion.setOpaque(false);
        txtArchivoSolucion.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(txtArchivoSolucion);

        javax.swing.GroupLayout pnlSolucionLayout = new javax.swing.GroupLayout(pnlSolucion);
        pnlSolucion.setLayout(pnlSolucionLayout);
        pnlSolucionLayout.setHorizontalGroup(
            pnlSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
        );
        pnlSolucionLayout.setVerticalGroup(
            pnlSolucionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
        );

        tabPnlInformacion.addTab("Solucion", pnlSolucion);

        editorVentana.setBackground(new java.awt.Color(255, 255, 204));
        editorVentana.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        editorVentana.setContentType("text/html");
        editorVentana.setEditable(false);
        editorVentana.setText("<html><font size=5>SARUM v1.3<br/></font>informacion</html>\"");
        editorVentana.setAutoscrolls(false);
        editorVentana.setFocusable(false);
        editorVentana.setName("txtinfo"); // NOI18N
        editorVentana.setOpaque(false);
        jScrollPane2.setViewportView(editorVentana);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(tabPnlInformacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPnlInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void informararchivo(SarumParadas prds,SarumRutas srms){
                String archivo="<b>Paradas</b><br/>";
                for(int a=0;a<prds.getListaParadas().size();a++){
                    archivo+=prds.getListaParadas().get(a).getNombreParada()+" : "+prds.getListaParadas().get(a).getNParada()+"<br/>";
                }
                archivo+="<b>Rutas</b><br/>";
                for(int a=0;a<srms.getListaRutas().size();a++){
                    archivo+=srms.getListaRutas().get(a).getNombreRuta()+" : "+srms.getListaRutas().get(a).getFrecuencia()+"<br/>";
                }
                txtArchivoMapa.setText(archivo);
		this.setVisible(true);
    }
    public void informararchivo2(ArrayList<Point[]> origendestino){
        String archivo="(Origen) - (Destino) <br/>";
        for(int a=0;a<origendestino.size()-1;a++){
            archivo+="("+origendestino.get(a)[0].x+" , "+origendestino.get(a)[0].y+")-("+origendestino.get(a)[1].x+" , "+origendestino.get(a)[1].y+")<br/>";
        }
        
        txtArchivoProblema.setText(archivo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane editorVentana;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel pnlArchivo;
    private javax.swing.JPanel pnlProblema;
    private javax.swing.JPanel pnlSolucion;
    private javax.swing.JTabbedPane tabPnlInformacion;
    private javax.swing.JEditorPane txtArchivoMapa;
    private javax.swing.JEditorPane txtArchivoProblema;
    private javax.swing.JEditorPane txtArchivoSolucion;
    // End of variables declaration//GEN-END:variables

}