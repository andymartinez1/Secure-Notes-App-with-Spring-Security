package com.andymartinez1.notes.service.impl;

import com.andymartinez1.notes.repository.NoteRepository;
import com.andymartinez1.notes.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;

public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteRepository noteRepository;
}
