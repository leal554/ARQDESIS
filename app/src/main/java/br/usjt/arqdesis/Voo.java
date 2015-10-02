package br.usjt.arqdesis;

import java.util.ArrayList;

/**
 * Created by leal_ on 26/09/2015.
 */
public class Voo {
    private ArrayList<String> Brasil;
    private ArrayList<String> AfricaDoSul;
    private ArrayList<String> Alemanha;
    private ArrayList<String> Argentina;
    private ArrayList<String> Australia;
    private ArrayList<String> Canada;
    private ArrayList<String> Inglaterra;
    private ArrayList<String> Japao;

    public Voo()
    {
        Brasil = new ArrayList<>();
        Brasil.add("Africa Do Sul");
        Brasil.add("Alemanha");
        Brasil.add("Argentina");
        Brasil.add("Austrália");
        Brasil.add("Canadá");
        Brasil.add("Japão");

        AfricaDoSul = new ArrayList<>();
        AfricaDoSul.add("Alemanha");
        AfricaDoSul.add("Austrália");
        AfricaDoSul.add("Japão");

        Alemanha = new ArrayList<>();
        Alemanha.add("Canadá");
        Alemanha.add("Inglaterra");
        Alemanha.add("Africa Do Sul");

        Argentina = new ArrayList<>();
        Argentina.add("Brasil");
        Argentina.add("Canadá");
        Argentina.add("Africa Do Sul");
        Argentina.add("Alemanha");


        Australia = new ArrayList<>();
        Australia.add("Argentina");
        Australia.add("Alemanha");
        Australia.add("Brasil");

        Canada = new ArrayList<>();
        Canada.add("Brasil");
        Canada.add("Inglaterra");
        
        Inglaterra = new ArrayList<>();
        Inglaterra.add("Alemanha");
        Inglaterra.add("Brasil");
        Inglaterra.add("Canadá");

        Japao = new ArrayList<>();
    }

    public String BuscaVooS(String pais)
    {
        String voos = "Nenhum voo disponivel "+ pais;

        if(pais.equals("Brasil"))
        {
            voos = "Voo disponiveis saindo "+ pais+ ": \n";
            for (int i = 0; i < Brasil.size(); i++)
            {
                voos += "\n" + Brasil.get(i);
            }
        }

        if(pais.equals("África do Sul"))
        {
            voos = "Voo disponiveis saindo "+ pais+ ": \n";

            for (int i = 0; i < AfricaDoSul.size(); i++)
            {
                voos += "\n" + AfricaDoSul.get(i);
            }
        }

        if(pais.equals("Alemanha"))
        {
            voos = "Voo disponiveis saindo "+ pais+ ": \n";

            for (int i = 0; i < Alemanha.size(); i++)
            {
                voos += "\n" + Alemanha.get(i);
            }
        }

        if(pais.equals("Argentina"))
        {
            voos = "Voo disponiveis saindo "+ pais+ ": \n";

            for (int i = 0; i < Argentina.size(); i++)
            {
                voos += "\n" + Argentina.get(i);
            }
        }

        if(pais.equals("Austrália"))
        {
            voos = "Voo disponiveis saindo "+ pais+ ": \n";

            for (int i = 0; i < Australia.size(); i++)
            {
                voos += "\n" + Australia.get(i);
            }
        }

        if(pais.equals("Inglaterra"))
        {
            voos = "Voo disponiveis saindo "+ pais+ ": \n";

            for (int i = 0; i < Inglaterra.size(); i++)
            {
                voos += "\n" + Inglaterra.get(i);
            }
        }

        if(pais.equals("Japão"))
        {
            voos = "Voo disponiveis saindo "+ pais+ ": \n";

            for (int i = 0; i < Japao.size(); i++)
            {
                voos += "\n" + Japao.get(i);
            }
        }
        return voos;
    }

    public ArrayList BuscaVooA(String pais)
    {
        ArrayList<String> avoos = new ArrayList<>();
        avoos.add("Voo disponiveis saindo "+ pais+ ": \n");

        if(pais.equals("Brasil"))
        {
            for (int i = 0; i < Brasil.size(); i++)
            {
                avoos.add(Brasil.get(i));
            }
        }

        if(pais.equals("África do Sul"))
        {
            for (int i = 0; i < AfricaDoSul.size(); i++)
            {
                avoos.add(AfricaDoSul.get(i));
            }
        }

        if(pais.equals("Alemanha"))
        {
            for (int i = 0; i < Alemanha.size(); i++)
            {
                avoos.add(Alemanha.get(i));
            }
        }

        if(pais.equals("Argentina"))
        {
            for (int i = 0; i < Argentina.size(); i++)
            {
                avoos.add(Argentina.get(i));
            }
        }

        if(pais.equals("Austrália"))
        {
            for (int i = 0; i < Australia.size(); i++)
            {
                avoos.add(Australia.get(i));
            }
        }

        if(pais.equals("Inglaterra"))
        {
            for (int i = 0; i < Inglaterra.size(); i++)
            {
                avoos.add(Inglaterra.get(i));
            }
        }

        if(pais.equals("Japão"))
        {
            for (int i = 0; i < Japao.size(); i++)
            {
                avoos.add(Japao.get(i));
            }
        }
        else
        {
            String voos = "Nenhum voo disponivel "+ pais;
            avoos.add(voos);
        }
        return avoos;
    }
}
