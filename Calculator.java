import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class CalculatorFrame extends WindowAdapter implements ActionListener
{
    public Frame fobj;
    public Button bobj_rad,bobj_deg,bobj_x_f,bobj_o_b,bobj_c_b,bobj_mod,bobj_ce;
    public Button bobj_inv,bobj_sin,bobj_in,bobj_7,bobj_8,bobj_9,bobj_div;
    public Button bobj_PI,bobj_cos,bobj_log,bobj_4,bobj_5,bobj_6,bobj_mul;
    public Button bobj_e,bobj_tan,bobj_root,bobj_1,bobj_2,bobj_3,bobj_min;
    public Button bobj_ans,bobj_exp,bobj_x_y,bobj_0,bobj_dot,bobj_eq,bobj_plus;
	public TextField tobj, tobj1;

    public String s = "";
    public String s1 = "";

    boolean num = false;
    boolean dot = false;

    ArrayList<String> token=new ArrayList<String>();

    public String postexp = new String();

    public CalculatorFrame(String name)
    {
        fobj = new Frame(name);

        bobj_rad = new Button("Rad");
        bobj_deg = new Button("Deg");
        bobj_x_f = new Button("x!");
        bobj_o_b = new Button("(");
        bobj_c_b = new Button(")");
        bobj_mod = new Button("%");
        bobj_ce = new Button("CE");

        bobj_inv = new Button("Inv");
        bobj_sin = new Button("sin");
        bobj_in = new Button("In");
        bobj_7 = new Button("7");
        bobj_8 = new Button("8");
        bobj_9 = new Button("9");
        bobj_div = new Button("/");

        bobj_PI = new Button("PI");
        bobj_cos = new Button("cos");
        bobj_log = new Button("log");
        bobj_4 = new Button("4");
        bobj_5 = new Button("5");
        bobj_6 = new Button("6");
        bobj_mul = new Button("*");

        bobj_e = new Button("e");
        bobj_tan = new Button("tan");
        bobj_root = new Button("root");
        bobj_1 = new Button("1");
        bobj_2 = new Button("2");
        bobj_3 = new Button("3");
        bobj_min = new Button("-");

        bobj_ans = new Button("ANS");
        bobj_exp = new Button("EXP");
        bobj_x_y = new Button("x^y");
        bobj_0 = new Button("0");
        bobj_dot = new Button(".");
        bobj_eq = new Button("=");
        bobj_plus = new Button("+");

        tobj = new TextField("0");
		tobj1 = new TextField("0");

        tobj.setBounds(20,40,660,40);
		
		tobj1.setBounds(20,85,660,20);

        bobj_rad.setBounds(22, 120,85,30);
        bobj_deg.setBounds(117, 120,85,30);
        bobj_x_f.setBounds(210, 120,85,30);
        bobj_o_b.setBounds(307, 120,85,30);
        bobj_c_b.setBounds(402, 120,85,30);
        bobj_mod.setBounds(497, 120,85,30);
        bobj_ce.setBounds(592, 120,85,30);

        bobj_inv.setBounds(22, 160,85,30);
        bobj_sin.setBounds(117, 160,85,30);
        bobj_in.setBounds(210, 160,85,30);
        bobj_7.setBounds(307, 160,85,30);
        bobj_8.setBounds(402, 160,85,30);
        bobj_9.setBounds(497, 160,85,30);
        bobj_div.setBounds(592, 160,85,30);

        bobj_PI.setBounds(22, 200,85,30);
        bobj_cos.setBounds(117, 200,85,30);
        bobj_log.setBounds(210, 200,85,30);
        bobj_4.setBounds(307, 200,85,30);
        bobj_5.setBounds(402, 200,85,30);
        bobj_6.setBounds(497, 200,85,30);
        bobj_mul.setBounds(592, 200,85,30);

        bobj_e.setBounds(22, 240,85,30);
        bobj_tan.setBounds(117, 240,85,30);
        bobj_root.setBounds(210, 240,85,30);
        bobj_1.setBounds(307, 240,85,30);
        bobj_2.setBounds(402, 240,85,30);
        bobj_3.setBounds(497, 240,85,30);
        bobj_min.setBounds(592, 240,85,30);

        bobj_ans.setBounds(22, 280,85,30);
        bobj_exp.setBounds(117, 280,85,30);
        bobj_x_y.setBounds(210, 280,85,30);
        bobj_0.setBounds(307, 280,85,30);
        bobj_dot.setBounds(402, 280,85,30);
        bobj_eq.setBounds(497, 280,85,30);
        bobj_plus.setBounds(592,280,85,30);

        fobj.add(bobj_rad);
        fobj.add(bobj_deg);
        fobj.add(bobj_x_f);
        fobj.add(bobj_o_b);
        fobj.add(bobj_c_b);
        fobj.add(bobj_mod);
        fobj.add(bobj_ce);
        fobj.add(tobj);
		fobj.add(tobj1);

        fobj.add(bobj_inv);
        fobj.add(bobj_sin);
        fobj.add(bobj_in);
        fobj.add(bobj_7);
        fobj.add(bobj_8);
        fobj.add(bobj_9);
        fobj.add(bobj_div);

        fobj.add(bobj_PI);
        fobj.add(bobj_cos);
        fobj.add(bobj_log);
        fobj.add(bobj_4);
        fobj.add(bobj_5);
        fobj.add(bobj_6);
        fobj.add(bobj_mul);

        fobj.add(bobj_e);
        fobj.add(bobj_tan);
        fobj.add(bobj_root);
        fobj.add(bobj_1);
        fobj.add(bobj_2);
        fobj.add(bobj_3);
        fobj.add(bobj_min);

        fobj.add(bobj_ans);
        fobj.add(bobj_exp);
        fobj.add(bobj_x_y);
        fobj.add(bobj_0);
        fobj.add(bobj_dot);
        fobj.add(bobj_eq);
        fobj.add(bobj_plus);
        
        // fobj.add(tobj2);
        //tobj.textarea.setAlignmentY(JTextArea.RIGHT_ALIGNMENT);
        fobj.setSize(700,340);
        fobj.setVisible(true);
        fobj.setLayout(null);
        fobj.setResizable(false);

        bobj_rad.addActionListener(this);
        bobj_deg.addActionListener(this);
        bobj_x_f.addActionListener(this);
        bobj_o_b.addActionListener(this);
        bobj_c_b.addActionListener(this);
        bobj_mod.addActionListener(this);
        bobj_ce.addActionListener(this);

        bobj_inv.addActionListener(this);
        bobj_sin.addActionListener(this);
        bobj_in.addActionListener(this);
        bobj_7.addActionListener(this);
        bobj_8.addActionListener(this);
        bobj_9.addActionListener(this);
        bobj_div.addActionListener(this);

        bobj_PI.addActionListener(this);
        bobj_cos.addActionListener(this);
        bobj_log.addActionListener(this);
        bobj_4.addActionListener(this);
        bobj_5.addActionListener(this);
        bobj_6.addActionListener(this);
        bobj_mul.addActionListener(this);

        bobj_e.addActionListener(this);
        bobj_tan.addActionListener(this);
        bobj_root.addActionListener(this);
        bobj_1.addActionListener(this);
        bobj_2.addActionListener(this);
        bobj_3.addActionListener(this);
        bobj_min.addActionListener(this);

        bobj_ans.addActionListener(this);
        bobj_exp.addActionListener(this);
        bobj_x_y.addActionListener(this);
        bobj_0.addActionListener(this);
        bobj_dot.addActionListener(this);
        bobj_eq.addActionListener(this);
        bobj_plus.addActionListener(this);

        fobj.addWindowListener(this);
    }

    public void windowClosing(WindowEvent obj)
    {
        System.exit(0);
    }

   public void actionPerformed(ActionEvent obj)
    {
        Object oobj = obj.getSource();
        
        if(oobj == bobj_rad)
        {
            s = s + "rad(";
            s1 = s1 + ",(,r";
            num = false;
            dot = false;
            // System.out.println("Radian");
        }
        else if(oobj == bobj_deg)
        {
            s = s + "Deg(";
            s1 = s1 + ",(,d";
            num = false;
            dot = false;
            // System.out.println("Degree");
        }
        else if(oobj == bobj_x_f)
        {
            s = s + "!";
            s1 = s1 + ",!";
            num = false;
            dot = false;
            // System.out.println("factorial");
        }
        else if(oobj == bobj_o_b)
        {
            s = s + "(";
            s1 = s1 + ",(";
            num = false;
            dot = false;
            // System.out.println("bracket open");
        }
        else if(oobj == bobj_c_b)
        {
            s = s + ")";
            s1 = s1 + ",)";
            num = false;
            dot = false;
            // System.out.println("bracket cloase");
        }
        else if(oobj == bobj_mod)
        {
            s = s + "%";
            s1 = s1 + ",%";
            num = false;
            dot = false;
            // System.out.println("mod");
        }
        else if(oobj == bobj_ce)
        {
            s = "";
            s1 = "";
            num = false;
            dot = false;
            // System.out.println("clear");
        }
        else if(oobj == bobj_inv)
        {
            s = s + "^-1";
            s1 = s1 + ",i";
            num = false;
            dot = false;
            // System.out.println("inv");
        }
        else if(oobj == bobj_sin)
        {
            s = s + "sin(";
            s1 = s1 + ",(,s";
            num = false;
            dot = false;
            // System.out.println("sin");
        }
        else if(oobj == bobj_in)
        {
            s = s + "In(";
            s1 = s1 + ",(,I";
            num = false;
            dot = false;
            // System.out.println("log in");
        }
        else if(oobj == bobj_7)
        {
            s = s + "7";
            if(num == true)
            {
                s1 = s1 + "7";
            }
            else
            {
                s1 = s1 + ",7";
            }
            num = true;
            // System.out.println("7");
        }
        else if(oobj == bobj_8)
        {
            s = s + "8";
            if(num == true)
            {
                s1 = s1 + "8";
            }
            else
            {
                s1 = s1 + ",8";
            }
            num = true;
            // System.out.println("8");
        }
        else if(oobj == bobj_9)
        {
            s = s + "9";
            if(num == true)
            {
                s1 = s1 + "9";
            }
            else
            {
                s1 = s1 + ",9";
            }
            num = true;
            // System.out.println("9");
        }
        else if(oobj == bobj_div)
        {
            s = s + "/";
            s1 = s1 + ",/";
            num = false;
            dot = false;
            // System.out.println("/");
        }
        else if(oobj == bobj_PI)
        {
            s = s + "PI";
            s1 = s1 + ",3.14";
            num = false;
            dot = false;
            // System.out.println("PI");
        }
        else if(oobj == bobj_cos)
        {
            s = s + "cos(";
            s1 = s1 + ",(,c";
            num = false;
            dot = false;
            // System.out.println("cos");
        }
        else if(oobj == bobj_log)
        {
            s = s + "log(";
            s1 = s1 + ",(,l";
            num = false;
            dot = false;
            // System.out.println("log");
        }
        else if(oobj == bobj_4)
        {
            s = s + "4";
            if(num  == true)
            {
                s1 = s1 + "4";
            }
            else
            {
                s1 = s1 + ",4";
            }
            num = true;
            
            // System.out.println("4");
        }
        else if(oobj == bobj_5)
        {
            s = s + "5";
            
            if(num  == true)
            {
                s1 = s1 + "5";
            }
            else
            {
                s1 = s1 + ",5";
            }
            num = true;
            // System.out.println("5");
        }
        else if(oobj == bobj_6)
        {
            s = s + "6";
            
            if(num  == true)
            {
                s1 = s1 + "6";
            }
            else
            {
                s1 = s1 + ",6";
            }
            num = true;
            // System.out.println("6");
        }
        else if(oobj == bobj_mul)
        {
            s = s + "*";
            s1 = s1 + ",*";
            num = false;
            dot = false;
            // System.out.println("*");
        }
        else if(oobj == bobj_e)
        {
            s = s + "e";
            s1 = s1 + ",2.71";
            num = false;
            dot = false;
            // System.out.println("e");
        }
        else if(oobj == bobj_tan)
        {
            s = s + "tan(";
            s1 = s1 + ",(,t";
            num = false;
            dot = false;
            // System.out.println("tan");
        }
        else if(oobj == bobj_root)
        {
            s = s + "root(";
            s1 = s1 + ",(,R";
            num = false;
            dot = false;

            // System.out.println("root");
        }
        else if(oobj == bobj_1)
        {
            s = s + "1";
            if(num  == true)
            {
                s1 = s1 + "1";
            }
            else
            {
                s1 = s1 + ",1";
            }
            num = true;
            // System.out.println("1");
        }
        else if(oobj == bobj_2)
        {
            s = s + "2";
            
            if(num  == true)
            {
                s1 = s1 + "2";
            }
            else
            {
                s1 = s1 + ",2";
            }
            num = true;
            // System.out.println("2");
        }
        else if(oobj == bobj_3)
        {
            s = s + "3";
            
            if(num  == true)
            {
                s1 = s1 + "3";
            }
            else
            {
                s1 = s1 + ",3";
            }
            num = true;
            // System.out.println("3");
        }
        else if(oobj == bobj_min)
        {
            s = s + "-";
            s1 = s1 + ",-";
            num = false;
            dot = false;
            // System.out.println("-");
        }
        else if(oobj == bobj_ans)
        {
            this.Split(this.s1);
            double d = this.CalculateExp(this.Stack());
            System.out.println(d);
			
			tobj1.setText("ans : " + String.valueOf(d));

            num = false;
            dot = false;
        }
        else if(oobj == bobj_exp)
        {
            s = s + "EXP(";
            s1 = s1 + ",(,E";

            num = false;
            dot = false;
            // System.out.println("exp");
        }
        else if(oobj == bobj_x_y)
        {
            s = s + "^";
            s1 = s1 + ",^";

            num = false;
            dot = false;
            // System.out.println("x_y");
        }
        else if(oobj == bobj_0)
        {
            s = s + "0";
            
            if(num  == true)
            {
                s1 = s1 + "0";
            }
            else
            {
                s1 = s1 + ",0";
            }
            num = true;
            // System.out.println("0");
        }
        else if(oobj == bobj_dot)
        {
            s = s + ".";
            
            if(num  == true && dot == false)
            {
                s1 = s1 + ".";
            }
            else if(num == false && dot == false)
            {
                s1 = s1 + ",.";
            }
            num = true;
        }
        else if(oobj == bobj_eq)
        {	
            this.Split(this.s1);
            double d = this.CalculateExp(this.Stack());
            System.out.println(d);
			
			tobj1.setText("ans : " + String.valueOf(d));

            num = false;
            dot = false;
        }
        else if(oobj == bobj_plus)
        {
            s = s + "+";
            s1 = s1 + ",+";
            num = false;
            dot =false;
        }
		
		tobj.setText(s);
    }
	
	public void Split(String sobj)
	{
		token.clear();
		
		String tokens[] = sobj.split(",");
		
		for(int i = 0; i < tokens.length; i++)
		{
			token.add(tokens[i]);
		}
	}
	
	public int priority(String sobj)
    {
        if(sobj.equals("+") || sobj.equals("-"))
        {
            return 2;
        }
        else if(sobj.equals("*")|| sobj.equals("/") || sobj.equals("%"))
        {
            return 3;
        }
		else if(sobj.equals("^"))
		{
			return 4;
		}
		else if(sobj.equals("!"))
		{
			return 5;
		}
		else if(sobj.equals("s") || sobj.equals("c") || sobj.equals("t") || sobj.equals("R") || sobj.equals("l") || sobj.equals("i") || sobj.equals("I") || sobj.equals("d") || sobj.equals("r"))
		{
			return 6;
		}
        else
        {
            return 1;
        }
    }
	
	public boolean isOperator(String sobj)
	{
		if
		(
		sobj.equals("+") || sobj.equals("-") || sobj.equals("*") || sobj.equals("/") || sobj.equals("!") || sobj.equals("^") || sobj.equals("s") || sobj.equals("c") || sobj.equals("t") || sobj.equals("R") || sobj.equals("l") || sobj.equals("i") || sobj.equals("I") || sobj.equals("d") || sobj.equals("r") || sobj.equals("%")
		)
		{
			return true;
		}
		else
		{
			return false;
		}
			
	}
	
	public double CalculateExp(String p)
    {
        String tokens[] = p.split(",");
		
		String i = "";
		
		ArrayList<String> token=new ArrayList<String>();
		
		for(int k = 0; k < tokens.length; k++) 
        {
			token.add(tokens[k]);  // tokens from post fix form p actual tokens for calculation
		}

        Stack<Double> s=new Stack<Double>();
		double x,y;

        for(int j = 0; j < token.size(); j++) 
        {
			i = token.get(j);
			
			if(isOperator(i))
            {
                if(i.equals("s") ||i.equals("c") ||i.equals("t") ||i.equals("l") || i.equals("I") || i.equals("R") || i.equals("!") || i.equals("d") || i.equals("r")) 
				{
					y = s.pop();
					s.push(calculate(y,i));
				}
				else
				{
					y=s.pop();
					x=s.pop();
					s.push(calculate(x,y,i));
				}
			}
            else
            {
				s.push(Double.valueOf(i));
            }
		}
	
		double res = 1;
		while(!s.empty()) 
        {
			res = s.pop();
		}
		return res; 
	}
	
	public double factorial(double y) 
	{
		double fact = 1;
		if(y == 0 || y == 1) 
		{
			fact = 1;
		}
		else 
		{
			for(int i = 2; i <= y; i++) 
			{
				fact *= i;
			}
		}
		return fact;
	}
	
	public String Stack()
	{
		Stack<String> sStack = new Stack<String>();

        String PostFix = "";
		String temp = "";

        token.add(")");
        sStack.push("(");

        String i;

        for(int j = 1; j < token.size(); j++)
        {
            i = token.get(j);

            if(i.equals("("))
            {
                sStack.push("(");
            }
            else if(i.equals(")"))
            {				
                while(sStack.peek() != "(")
                {
                    PostFix = PostFix + sStack.pop() + ",";
                }
                temp = sStack.pop();
            }
            else if(isOperator(i) == true)
            {
                while(!sStack.empty() && priority(sStack.peek()) >= priority(i))
                {
                    PostFix = PostFix + sStack.pop() + ",";
                }

                sStack.push(i);
            }
            else
            {
                PostFix = PostFix + i + ",";
            }
        }
        while(!sStack.isEmpty())
        {
			temp = sStack.pop();
			
            if(!temp.equals("(") && !temp.equals(")"))
            {
                PostFix = PostFix + temp + ",";
            }
        }

        String tokenss[] = PostFix.split(",");
		
		for(int j = 0; j < tokenss.length; j++)
		{
			System.out.println(j + "  " + tokenss[j]);
		}
		
		System.out.println("");
		
        return PostFix;
	}
	
	public double calculate(double x,double y,String c)
	{
		double res = 0;
		
		if(c.equals("-"))
		{
			res = x - y;
		}
		else if(c.equals("+"))
		{
			res = x + y;
		}
		else if(c.equals("*"))
		{
			res = x * y;
		}
		else if(c.equals("/"))
		{
			res = x / y;
		}
		else if(c.equals("%"))
		{
			res = x % y;
		}
		else if(c.equals("^"))
		{
			res = Math.pow(x,y);
		}
		else
		{
			res = 0;
		}

		return res;
	}
	
	public double calculate(double y,String c) 
	{
		double res = 0;
		
		if(c.equals("l"))
		{
			res = Math.log10(y);
		}
		else if(c.equals("s"))
		{
			res= Math.sin(y);
		}
		else if(c.equals("c"))
		{
			res= Math.cos(y);
		}
		else if(c.equals("t"))
		{
			res = Math.tan(y);
		}
		else if(c.equals("R"))
		{
			res = Math.sqrt(y);
		}
		else if(c.equals("!"))
		{
			res = factorial(y);
		}
		else if(c.equals("d"))
		{
			res = y * 180 / 3.14;
		}
		else if(c.equals("r"))
		{
			res = y * 3.14/ 180;
		}
		/*else if(c.equals("i")) // inverse
		{
			res = Math.i(y);
		}*/
		else if(c.equals("I"))
		{
			res = Math.log(y); // log in 
		}
		else
		{
			res = 0;
		}

		return res;
	}
}

class Calculator
{
	public static void main(String arg[])
	{
		CalculatorFrame cobj = new CalculatorFrame("Calculator");
	}
}
