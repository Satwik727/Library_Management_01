package com.example.library.service;

import com.example.library.entity.IssueRecord;
import com.example.library.repository.IssueRecordRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    private final IssueRecordRepository repository;

    public IssueService(IssueRecordRepository repository) {
        this.repository = repository;
    }

    public List<IssueRecord> getAllIssues() {
        return repository.findAll();
    }

    public void issueBook(IssueRecord record) {
        repository.save(record);
    }
}
