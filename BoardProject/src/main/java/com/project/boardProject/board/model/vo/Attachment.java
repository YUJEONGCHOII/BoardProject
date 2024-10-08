package com.project.boardProject.board.model.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Attachment{
	private int imgNo;
	private String imgOriginalName;
	private String imgRename;
	private Date imgCreateDate;
	private Date imgModifyDate;
	private String imgStatus;
	private String imgKey;
	private String imgPath;
	private int level;
	private int boardType;
}