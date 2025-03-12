public class Professor {
    private String nome;
    private int anosExperiencia;

    public Professor(String nome, int anosExperiencia) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }



    public String classificarProfessor() {
        return switch (anosExperiencia) {
            case 0, 1, 2 -> "Iniciante";
            case 3, 4, 5 -> "Intermediário";
            case 6, 7, 8 -> "Avançado";
            default -> "Mestre";
        };
    }

        @Override
        public String toString(){
            return "Professor: " + nome + ", " + anosExperiencia + " anos de experiência";
        };
        //Comentario inserido na branch main
        //Alteração na Branch:"Alteracao"
    }

