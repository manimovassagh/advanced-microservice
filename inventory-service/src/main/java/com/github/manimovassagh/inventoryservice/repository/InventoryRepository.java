package com.github.manimovassagh.inventoryservice.repository;

import com.github.manimovassagh.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Long> {
}
