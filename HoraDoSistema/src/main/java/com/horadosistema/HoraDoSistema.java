/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.horadosistema;

import java.util.Date;

/**
 *
 * @author gabriel
 */
public class HoraDoSistema {

    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
        System.out.println(System.getProperty("user.language"));
    }
}
