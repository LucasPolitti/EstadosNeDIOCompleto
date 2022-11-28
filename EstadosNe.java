public class EstadosNe {


    private String estado;
    private Integer populacao;

    
    

    public EstadosNe(String estado, Integer populacao) {
        this.estado = estado;
        this.populacao = populacao;
    }

    /**
     * @return String return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return Integer return the populacao
     */
    public Integer getPopulacao() {
        return populacao;
    }

    /**
     * @param populacao the populacao to set
     */
    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    @Override
    public String toString() {
        return "EstadosNe [estado=" + estado + ", populacao=" + populacao + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
        result = prime * result + ((populacao == null) ? 0 : populacao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EstadosNe other = (EstadosNe) obj;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        if (populacao == null) {
            if (other.populacao != null)
                return false;
        } else if (!populacao.equals(other.populacao))
            return false;
        return true;
    }

    

}
