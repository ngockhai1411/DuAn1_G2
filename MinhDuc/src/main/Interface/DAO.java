/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main.Interface;

import java.util.List;

/**
 *
 * @author Admin
 */
public interface DAO<ThucThe, GiaTri> {

    List<ThucThe> getAll();

    Integer add(ThucThe tt);

    Integer update(ThucThe tt);

    Integer xoa(GiaTri id);

    List<ThucThe> timKemTheoID(GiaTri id);
}
