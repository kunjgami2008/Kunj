import React,{useState,useEffect} from 'react';
import {useParams,useNavigate} from 'react-router-dom';

function UpdateStudent()
{
	const{id} = useParams();
	const navigate = useNavigate();
	const API="https://6ac1c3273f4ae78f6944b683.mockapi.io/student";

	const [data,setData] = useState({
							RollNo:"",
							Name:"",
							Class:"",
							Profile:""
							});

	useEffect(()=>{
		fetch(API+"/"+id)
			.then((res)=>res.json())
			.then((data)=>{
				setData(data);
			});
	},[id]);

	const imgChange=(e)=>{
		const file=e.target.files[0];
		const reader=new FileReader();
		reader.onloadend = () => {setData({...data,Profile:reader.result})}
		reader.readAsDataURL(file);
	}

	return(
		<div>
			<h1>Update Student Data Form</h1>
			<p>
			RollNo: <input type="text" value={data.RollNo}
			onChange={(e)=>{setData({...data,RollNo:e.target.value})}}/>
			</p>
			<p>
			Name: <input type="text" value={data.Name}
			onChange={(e)=>{setData({...data,Name:e.target.value})}}/>
			</p>
			<p>
			Class: <input type="text" value={data.Class} 
			onChange={(e)=>{setData({...data,Class:e.target.value})}}/>
			</p>
			<p>
			Profile: <input type="file" accept="image/*" onChange={imgChange}/>
			</p>
			<input type="button" value="UPDATE" onClick={()=>{
				fetch(API+"/"+id,{
					method:"PUT",
					body:JSON.stringify(data),
					headers:{"Content-Type":"application/json"}
				})
				.then(()=>{
					alert("Record Updated Succcesfully!");
					navigate("/Student")
				})
			}}/>

		</div>
		);
}

export default UpdateStudent;