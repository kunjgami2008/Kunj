import React from 'react';
import {useState,useEffect} from 'react';
import {Link} from 'react-router-dom';
function Student()
{
	const [student,setStudent] = useState([]);
	const API="https://6ac1c3273f4ae78f6944b683.mockapi.io/student";

	useEffect(()=>{
		fetch(API)
			.then((res)=>res.json())
			.then((data)=>{
				setStudent(data);
			});
	},[]);

	const deleteStudent = (id) => {
		fetch(API + "/" + id,{
			method:"DELETE"
		})
		.then(()=>{
			alert("Record Deleted Successfully!")
			fetch(API)
				.then((res)=>res.json())
				.then((data)=>{
				setStudent(data);
			});
		})	
	}

	return(
		<div>
			<table border="1">
				<thead>
					<tr>
						<th>RollNo</th>
						<th>Name</th>
						<th>Class</th>
						<th>Profile</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					{student.map((s)=>(
						<tr key={s.id}>
							<td>{s.RollNo}</td>
							<td>{s.Name}</td>
							<td>{s.Class}</td>
							<td><img src={s.Profile} height="100" width="100"/></td>
							<td><button onClick={()=>deleteStudent(s.id)}>DELETE</button>
							<Link to={"/update/"+s.id}> <button>Update</button></Link>
							</td>
						</tr>	
						))
					}
				</tbody>
			</table>
		</div>
		)
}

export default Student;