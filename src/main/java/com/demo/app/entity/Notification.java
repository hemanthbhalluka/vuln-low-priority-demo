package com.demo.app.entity;
import jakarta.persistence.*;
@Entity @Table(name="notifications") public class Notification { @Id @GeneratedValue private Long id; private String name; }