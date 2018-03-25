package com.example.easynotes2.repository;

import com.example.easynotes2.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}