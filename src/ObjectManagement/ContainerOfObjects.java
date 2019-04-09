package ObjectManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 8180651
 */
public class ContainerOfObjects {
    
    private final int DEFAULT_SIZE = 100;
    private Object object[];
    private int counter = 0;
   
    
    //metodo construtor
    
    //Valor máximo de elementos que ContainerOfObjects pode conter
    public ContainerOfObjects(int maxSize){
        this.object = new Object[maxSize];
    }
    //Valor por defeito de elementos (tamanho omitido) que ContainerOfObjects pode conter
    public ContainerOfObjects(Object[] object){
        this.object = object;
        this.counter = this.object.length;
    }
    //Instanciar com base num vetor de elementos recebidos
    public ContainerOfObjects(){
        this.object = new Object[DEFAULT_SIZE];
    }
    //Operações de adicionar, remover, substituir e procurar objectos
    protected boolean addObject(Object newObject){
        if(counter < object.length){
            object[counter] = newObject;
            counter +=1;
            return true;
        }else{
            System.out.println("Array cheio.");
            return false;
        }
    }
    protected Object removeObject(int position){
        if(position < object.length && position != -1){
            if(object[position] == null){
                System.out.println("Objecto nao existe");
                return null;
            }else{
                Object delete = object[position];
                object[position] = null;
                for(int i = position; i <(counter-1); i++){
                    object[i]=object[i + 1];
                }
                counter -= 1;
                object[counter] = null;
                return delete;
            }
        }else {
            System.out.println("Posicao Inexistente");
            return null;
        }
    }
    protected boolean setObject(int position, Object newObject){
        if(position < object.length){
            if(object[position] == null){
                System.out.println("Nao existe nenhum objecto nesta posicao");
                return false;
            }else {
                object[position]= newObject;
                return true;
            }
        }else {
            System.out.println("Posicao Inexistente");
            return false;
        }
    }
    protected int findObject(Object obj){
        for(int i = 0; i < this.object.length; i++){
            if(this.object[i].equals(obj)){
                return i;
            }
        }
        return -1;
    }
    
}
