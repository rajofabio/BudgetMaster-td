package com.BudgetMaster;


import java.util.ArrayList;
import java.util.List;

class Utilisateur {
    private String nom;
    private double budgetMensuel;
    private List<Depense> listeDepenses;

    public Utilisateur(String nom, double budgetMensuel) {
        this.nom = nom;
        this.budgetMensuel = budgetMensuel;
        this.listeDepenses = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getBudgetMensuel() {
        return budgetMensuel;
    }

    public void setBudgetMensuel(double budgetMensuel) {
        this.budgetMensuel = budgetMensuel;
    }

    public List<Depense> getListeDepenses() {
        return listeDepenses;
    }

    public void ajouterDepense(Depense depense) {
        this.listeDepenses.add(depense);
    }

    public void afficherDepenses() {
        for (Depense depense : listeDepenses) {
            System.out.println(depense);
        }
    }

}
