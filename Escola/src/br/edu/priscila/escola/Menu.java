package br.edu.priscila.escola;

import br.edu.priscila.escola.Cadastro.AlunoConsulta;
import br.edu.priscila.escola.Cadastro.CursoConsulta;
import br.edu.priscila.escola.Cadastro.DisciplinaConsulta;
import br.edu.priscila.escola.Cadastro.ProfessorConsulta;
import javax.swing.JFrame;

public class Menu extends javax.swing.JFrame {

    public CursoConsulta formCursoConsulta;
    public AlunoConsulta formAlunoConsulta;
    public ProfessorConsulta formProfessorConsulta;
    public DisciplinaConsulta formDisciplinaConsulta;

    public Menu() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuAluno = new javax.swing.JMenuItem();
        mnuCurso = new javax.swing.JMenuItem();
        mnuDisciplina = new javax.swing.JMenuItem();
        mnuProfessor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuAluno1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastro");

        mnuAluno.setText("Aluno");
        mnuAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAlunoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuAluno);

        mnuCurso.setText("Curso");
        mnuCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCursoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuCurso);

        mnuDisciplina.setText("Disciplina");
        mnuDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDisciplinaActionPerformed(evt);
            }
        });
        jMenu1.add(mnuDisciplina);

        mnuProfessor.setText("Professor");
        mnuProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProfessorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuProfessor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Matrícula");

        mnuAluno1.setText("Aluno");
        mnuAluno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAluno1ActionPerformed(evt);
            }
        });
        jMenu2.add(mnuAluno1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 407, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCursoActionPerformed
        try {
            formCursoConsulta = new CursoConsulta();
            formCursoConsulta.setVisible(true);
            formCursoConsulta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuCursoActionPerformed

    private void mnuAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAlunoActionPerformed
        try {
            formAlunoConsulta = new AlunoConsulta();
            formAlunoConsulta.setVisible(true);
            formAlunoConsulta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuAlunoActionPerformed

    private void mnuProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProfessorActionPerformed
        try {
            formProfessorConsulta = new ProfessorConsulta();
            formProfessorConsulta.setVisible(true);
            formProfessorConsulta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuProfessorActionPerformed

    private void mnuDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDisciplinaActionPerformed
         try {
            formDisciplinaConsulta = new DisciplinaConsulta();
            formDisciplinaConsulta.setVisible(true);
            formDisciplinaConsulta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_mnuDisciplinaActionPerformed

    private void mnuAluno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAluno1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuAluno1ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuAluno;
    private javax.swing.JMenuItem mnuAluno1;
    private javax.swing.JMenuItem mnuCurso;
    private javax.swing.JMenuItem mnuDisciplina;
    private javax.swing.JMenuItem mnuProfessor;
    // End of variables declaration//GEN-END:variables
}
