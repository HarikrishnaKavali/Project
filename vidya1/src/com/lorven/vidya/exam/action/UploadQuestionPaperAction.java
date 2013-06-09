package com.lorven.vidya.exam.action;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.lorven.vidya.exam.business.ExamInterface;
import com.opensymphony.xwork2.ActionSupport;

public class UploadQuestionPaperAction extends ActionSupport //implements ServletRequestAware
{

	private static final long serialVersionUID = 1L;
	private String examcode, examtype, subject, incharge;
	private File uploadFile;
	public File getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(File uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getUploadFileContentType() {
		return uploadFileContentType;
	}

	public void setUploadFileContentType(String uploadFileContentType) {
		this.uploadFileContentType = uploadFileContentType;
	}

	public String getUploadFileFileName() {
		return uploadFileFileName;
	}

	public void setUploadFileFileName(String uploadFileFileName) {
		this.uploadFileFileName = uploadFileFileName;
	}

	private String uploadFileContentType;
	private String uploadFileFileName;		

	
	private Date date;
	private File uploadfile;

	public File getUploadfile() {
		return uploadfile;
	}

	public void setUploadfile(File uploadfile) {
		this.uploadfile = uploadfile;
	}

	public Date getTodayDate() {

		return new Date();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIncharge() {
		return incharge;
	}

	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}

	public String getExamcode() {
		return examcode;
	}

	public void setExamcode(String examcode) {
		this.examcode = examcode;
	}

	public String getExamtype() {
		return examtype;
	}

	public void setExamtype(String examtype) {
		this.examtype = examtype;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	HttpServletRequest request=null;
	public String execute() {

		int msg = 0;
		File fileToCreate=null;
		try {
			
			/*String filePath = request.getSession().getServletContext()
					.getRealPath("/");
			System.out.println("Server path:" + filePath);
			File fileN = new File(filePath, this.uploadFileFileName);
			FileUtils.copyFile(this.uploadFile, fileN);*/
			
			
			
			String filePath = "d:/Myuploads"; // Give your own path
			 System.out.println("Server path:" + filePath); // test your path
			 fileToCreate = new File(filePath,examcode.concat(uploadFileFileName));//
			// Create file name same as original 
			 FileUtils.copyFile(uploadFile,	 fileToCreate); // Just copy temp file content tos this file			
			
			WebApplicationContext context = WebApplicationContextUtils
					.getRequiredWebApplicationContext(ServletActionContext
							.getServletContext());

			ExamInterface examInterface = (ExamInterface) context
					.getBean("uploadExam");

			UploadQuestionPaperAction questionPaper = (UploadQuestionPaperAction) context
					.getBean("questionPaper");
			questionPaper.setExamcode(examcode);			
			questionPaper.setExamtype(examtype);
			questionPaper.setSubject(subject);
			questionPaper.setDate(date);
			questionPaper.setIncharge(incharge);

			msg = examInterface.insertExamDetails(questionPaper);


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
						
			return"input";
		}
		finally
		{
			fileToCreate=null;
		}

		if (msg == 0) {
			return "failure";
		} else {
			return "success";
		}

	}

	/*@Override
	public void setServletRequest(HttpServletRequest servletRequest) {
		
		this.request=servletRequest;
	}
*/
}
