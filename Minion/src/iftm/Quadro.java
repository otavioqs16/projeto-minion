package iftm;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.QuadCurve2D;

import javax.swing.JPanel;

public class Quadro extends JPanel{

	@Override
	protected void paintComponent(Graphics graf) {
		super.paintComponent(graf);
		
		Graphics2D g = (Graphics2D) graf;
		
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	
		
		//Corpo
		g.setColor(new Color(138, 0, 0));
		g.fillRoundRect(300, 100, 300, 600, 350, 350);
		g.setColor(Color.black);
		
		AffineTransform posicaoZero1 = g.getTransform();
		g.rotate(Math.toRadians(-70), 535, 400);
		
		g.fillRoundRect(520, 400, 80, 50, 30, 30);
		
		g.setTransform(posicaoZero1);
		
		AffineTransform posicaoZero2 = g.getTransform();
		g.rotate(Math.toRadians(70), 360, 405);
		
		g.fillRoundRect(300, 400, 80, 50, 30, 30);
		
		g.setTransform(posicaoZero2);
		
		BasicStroke grossa8 = new BasicStroke(20);
		g.setStroke( grossa8 );
		
		g.drawLine(325, 410, 345, 460);
		
		g.drawArc(350, 375, 200, 80, -180, 180);
		
		g.drawLine(555, 455, 575, 405);
		
		BasicStroke grossa9 = new BasicStroke(30);
		g.setStroke(grossa9);
		g.setColor(Color.black);
		g.drawLine(452, 475, 452, 540);
		
		g.setColor(Color.black);
		g.fillRoundRect(380, 520, 150, 140, 40, 40);
		g.fillOval(400, 500, 10, 10);
		g.fillRoundRect(340, 458, 100, 100, 40, 40);
		g.fillRoundRect(465, 458, 100, 100, 40, 40);
		
		BasicStroke grossa10 = new BasicStroke(30);
		g.setStroke(grossa10);
		
		g.drawLine(370, 550, 390, 580);
		g.drawLine(523, 570, 543, 540);
		g.fillRoundRect(400, 430, 100, 50, 40, 40);
		g.fillArc(350, 590, 200, 110, -180, 180);
		g.drawLine(340, 590, 390, 590);
		g.drawLine(540, 590, 560, 590);
		g.drawLine(500, 100, 520, 120);
		g.setColor(Color.BLACK);
		g.fillRect(300, 270, 300, 100);
		
		
		BasicStroke grossa = new BasicStroke(4);
		g.setStroke( grossa );
		
		
		float[] faixa = {0f, 0.5f, 1f};
		Color[] cores = {Color.BLACK, new Color(86, 53, 35),new Color(0,148,179)};
		LinearGradientPaint grad2 = new LinearGradientPaint(0,0,1250,0, faixa,cores);
		g.setPaint(grad2);
		
		
		g.setColor(new Color(214,214,214));
		//Cabeça
		g.fillRoundRect(300, 70, 300, 350, 300, 300);
		
		//Boca
		/*
		g.setColor(new Color(26,0,0));
		g.drawArc(390, 320, 60, 17, 0, 180);
		g.drawArc(450, 320, 60, 17, 0, 180);
		g.drawArc(390, 300, 120, 65, -180, 180);
		g.drawArc(390, 320, 120, 20, -180, 180);
		*/
		
		//Olho Direito
		g.setColor(Color.DARK_GRAY);
		BasicStroke grossa2 = new BasicStroke(20);
		g.setStroke( grossa2 );
		g.drawLine(310, 210, 325, 210);
		g.setColor(Color.gray);
		g.fillOval(330, 140, 120, 120);
		g.setColor(Color.white);
		g.fillOval(340, 150, 100, 100);
		g.setColor(new Color(135, 67, 67));
		g.fillOval(375, 190, 40, 40);
		g.setColor(Color.BLACK);
		g.fillOval(385, 200, 20, 20);
		g.setColor(Color.white);
		g.fillOval(385, 200, 10, 10);
		
		
		//Olho Esquerdo
		g.setColor(Color.gray);
		g.fillOval(450, 140, 120, 120);
		g.setColor(Color.black);
		g.fillOval(460, 150, 100, 100);
		g.fillRoundRect(520, 180, 60, 60, 10, 10);
		g.setColor(Color.GRAY);
		g.fillRoundRect(520, 190, 40, 40, 10, 10);
		g.setColor(new Color(202, 0, 0));
		g.fillOval(470, 170, 70, 70);
		g.setColor(Color.white);
		g.fillRoundRect(500, 200, 55, 18, 10, 10);
		g.setColor(Color.red);
		g.fillRoundRect(501, 201, 53, 16, 10, 10);
		BasicStroke grossa7 = new BasicStroke(1);
		g.setStroke( grossa7 );
		g.setColor(Color.white);
		g.drawLine(505, 210, 550, 210);
		BasicStroke grossa3 = new BasicStroke(5);
		g.setStroke( grossa3 );
		g.setColor(Color.white);
		g.drawArc(480, 185, 40, 40, 90, 180);
		BasicStroke grossa4 = new BasicStroke(3);
		g.setStroke( grossa4 );
		g.setColor(Color.gray);
		g.drawOval(470, 170, 70, 70);
		BasicStroke grossa5 = new BasicStroke(3);
		g.setStroke( grossa5 );
		g.setColor(Color.white);
		g.drawOval(473, 173, 65, 65);
		BasicStroke grossa6 = new BasicStroke(20);
		g.setStroke( grossa6 );
		g.setColor(Color.black);
		g.drawLine(570, 210, 590, 210);
		
	
		//Barba
		/*GeneralPath barba = new GeneralPath();
		barba.moveTo(385, 350);
		barba.curveTo(170,190,400,400, 800,350);
		barba.closePath();
		
		g.setColor(Color.BLACK);
		g.fill(barba);*/
		
		//BraçoDir
		BasicStroke grossapoha1 = new BasicStroke(30);
		g.setStroke(grossapoha1);
		g.setColor(new Color(138, 0, 0));
		g.drawLine(650, 580, 652, 630);
		g.setColor(new Color(138, 0, 0));
		float[] traco = {10,0};
		BasicStroke tracejado = new BasicStroke(40,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, traco, 0);
		g.setStroke(tracejado);
		g.drawLine(610, 420, 630, 600);
		g.setColor(Color.BLACK);
		g.fillRoundRect(560, 370, 80, 50, 30, 30);
		float[] raiva = {10,0};
		BasicStroke qeupassei = new BasicStroke(20,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, raiva, 0);
		g.setStroke(qeupassei);
		g.drawLine(640, 460, 645, 510);
		BasicStroke grassa = new BasicStroke(10,BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, raiva, 0);
		g.setStroke(grassa);
		g.drawLine(600, 500, 640, 480);
		BasicStroke basic = new BasicStroke(40);
		g.setStroke(basic);
		g.drawLine(628, 580, 633, 630);
		BasicStroke grossapau2 = new BasicStroke(14, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, traco,0);
		g.setStroke(grossapau2);
		g.drawArc(620, 647, 30, 30, 270, 180);
		BasicStroke grossapau3 = new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, traco,0);
		g.setStroke(grossapau3);
		g.drawArc(623, 650, 13, 13, -270, 180);
		
		
		//BraçoEsq
		BasicStroke grossapoha = new BasicStroke(30);
		g.setStroke(grossapoha);
		g.setColor(new Color(138, 0, 0));
		g.drawLine(250, 580, 247, 630);
		g.setColor(new Color(138, 0, 0));
		BasicStroke stroke = new BasicStroke(40, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND,1, traco,0);
		g.setStroke(stroke);
		g.drawLine(290, 420, 270, 600);
		g.setColor(Color.BLACK);
		g.fillRoundRect(260, 370, 80, 50, 30, 30);
		g.setStroke(qeupassei);
		g.drawLine(257, 460, 250, 510);
		g.setStroke(grassa);
		g.drawLine(297, 500, 265, 480);
		BasicStroke stroke1 = new BasicStroke(40);
		g.setStroke(stroke1);
		g.drawLine(273, 580, 267, 630);
		BasicStroke grossapau = new BasicStroke(14, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, traco,0);
		g.setStroke(grossapau);
		g.drawArc(250, 647, 30, 30, -270, 180);
		BasicStroke grossapau1 = new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1, traco,0);
		g.setStroke(grossapau1);
		g.drawArc(265, 650, 13, 13, 270, 180);
		
		//Alvo
		g.setColor(Color.red);
		BasicStroke storke = new BasicStroke(4);
		g.setStroke(storke);
		g.drawOval(500, 480, 25, 25);
		g.drawOval(507, 487, 10, 10);
		g.drawLine(512, 475, 512, 510);
		g.drawLine(495, 492, 530, 492);
		
		//Pé esquerdo
		g.setColor(Color.BLACK);
		GeneralPath pe = new GeneralPath();
		pe.moveTo(390, 688);
		pe.lineTo(390, 730);
		pe.lineTo(320, 730);
		pe.lineTo(320, 705);
		pe.lineTo(350, 705);
		pe.lineTo(370, 670);
		g.fill(pe);
		
		//Pé direito
		GeneralPath pe2 = new GeneralPath();
		pe2.moveTo(500, 688);
		pe2.lineTo(500, 730);
		pe2.lineTo(570, 730);
		pe2.lineTo(570, 705);
		pe2.lineTo(538, 705);
		pe2.lineTo(520, 670);
		g.fill(pe2);
		
		//Máscara
		BasicStroke baics = new BasicStroke(10);
		g.setStroke(baics);
		g.setColor(Color.DARK_GRAY);
		g.drawLine(295, 270, 380, 320);
		g.drawLine(380, 320, 450, 290);
		g.drawArc(443, 287, 15, 15, 20, 140);
		g.drawLine(450, 290, 510, 320);
		g.drawLine(510, 320, 600, 270);
		g.drawArc(383, 245, 127, 160, -180, 180);
		BasicStroke mata = new BasicStroke(5);
		g.setStroke(mata);
		g.drawLine(300, 130, 600, 130);
		BasicStroke mata2 = new BasicStroke(30);
		g.setStroke(mata2);
		g.drawArc(300, 67, 100, 100, 0, 180);
		g.drawArc(500, 67, 100, 100, 0, 180);
		g.fillOval(450, 310, 10, 10);
		g.fillOval(470, 330, 10, 10);
		g.fillOval(465, 353, 10, 10);
		g.fillOval(447, 375, 10, 10);
		g.fillOval(420, 320, 10, 10);
		g.fillOval(410, 340, 10, 10);
		g.fillOval(425, 360, 10, 10);
		
	}
	
}
