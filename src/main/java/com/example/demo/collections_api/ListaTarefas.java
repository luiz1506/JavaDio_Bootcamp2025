package com.example.demo.collections_api;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
        
    }
    
    public void adicionarTarefa (String descricao){
        tarefaList.add(new Tarefa(descricao));

    }

    public void removerTarefa (String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);

            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();

    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O número total de elementos na tarefa é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Tarefa Uno");
        listaTarefas.adicionarTarefa("Tarefa Uno");
        listaTarefas.adicionarTarefa("Tarefa Tres");
        listaTarefas.adicionarTarefa("Tarefa Quatro");

        System.out.println("O número total de elementos na tarefa é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa Uno");

        System.out.println("O número total de elementos na tarefa é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();
    }
}
