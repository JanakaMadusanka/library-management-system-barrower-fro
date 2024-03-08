package org.example.service;

import org.example.dto.BorrowerDto;
import org.example.entity.BorrowerEntity;
import java.util.List;

public interface BorrowerService {
    void addBorrower(BorrowerDto borrowerDto);
    List<BorrowerEntity> getBorrowers();
    boolean deleteBorrower(Long id);
    BorrowerDto getBorrowerByUserName(String userName);
}
