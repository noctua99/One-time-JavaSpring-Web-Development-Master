package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.TodoEntity;
import org.example.model.TodoRequest;
import org.example.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    // To Do List 목록에 아이템을 추가
    public TodoEntity add(TodoRequest request) {
        TodoEntity entity = new TodoEntity();
        entity.setTitle(request.getTitle());
        entity.setOrder(request.getOrder());
        entity.setCompleted(request.getCompleted());
        return this.todoRepository.save(entity);
    }

    // To Do List 목록 중 특정 아이템을 조회
    public TodoEntity searchById(Long id) {
        return this.todoRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    // To Do List 전체 목록을 조회
    public List<TodoEntity> searchAll() {
        return this.todoRepository.findAll();
    }

    // To Do List 목록 중 특정 아이템을 수정
    public TodoEntity updateById(Long id, TodoRequest request) {
        TodoEntity entity = searchById(id);
        if (request.getTitle() != null) {
            entity.setTitle(request.getTitle());
        }if (request.getOrder() != null) {
            entity.setOrder(request.getOrder());
        }
        if (request.getCompleted() != null) {
            entity.setCompleted(request.getCompleted());
        }
        return this.todoRepository.save(entity);
    }

    // To Do List 목록 중 특정 아이템을 삭제
    public void deleteById(Long id) {
        this.todoRepository.deleteById(id);
    }

    // To Do List 전체 목록을 삭제
    public void deleteAll() {
        this.todoRepository.deleteAll();
    }
}
