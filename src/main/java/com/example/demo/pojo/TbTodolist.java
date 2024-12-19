package com.example.demo.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_todolist")
public class TbTodolist {
    @TableId
    private Integer id;
    private String task;
    private String dueDate;
    private String isCompleted;
    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getIsComplete() {
        return isCompleted;
    }

    public void setIsComplete(String isComplete) {
        this.isCompleted = isComplete;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "TbTodolist{" +
                "id=" + id +
                ", task='" + task + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", isCompleted='" + isCompleted + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }
}
