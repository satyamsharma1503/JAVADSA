import { useState } from 'react'
import './App.css'

// Api=https://api.unsplash.com/photos/users/ashbot/likes?page=1
//  Api-key=V6y67v629Tv-Zty1B0BCn81XYvkluDFTjbpRBbdhQNs
function App() {
  const [search, setSearch] = useState()
  const[data , setData] =useState([])
  const [count , setCount] =useState(1)

  let API_KEY = `V6y67v629Tv-Zty1B0BCn81XYvkluDFTjbpRBbdhQNs`;

  const AddImage =()=>{
  setCount(count+1)
  }
   const Previous =()=>{
    if(count===1){
      return count;
    }
  setCount(count-1)
  }
const handleSearch=(e)=>{
  setSearch(e.target.value)
}
  const getData = () => {
    myFun(search);
  };
const myFun = async(searchValue)=>{
  const get = await fetch(
    `https:/api.unsplash.com/search/photos?page=${count}&query=${searchValue}&client_id=${API_KEY}`
  );
  const jsonData= await get.json();
  setData(jsonData.results);
}

  return (
    <>
      <div>
        <h1 className="text-gray-600 p-5 text-4xl">Image Search Website</h1>
        <div className=" flex  justify-center items-center">
          <input
            className="w-2/4 h-11 px-1 border-2 border-blue-600 outline-none rounded-l-full"
            type="text"
            onChange={handleSearch}
            placeholder="Search Image..."
          />
          <button
            onClick={getData}
            className="w-20 h-11  bg-blue-600 hover:bg-blue-400 cursor-pointer rounded-r-full"
          >
            Search
          </button>
        </div>
      </div>
      <div className="w-full flex justify-center overflow-hidden gap-2 border-2 items-center flex-wrap m-2">
        {data.map((curVal, index) => {
          {
            /* console.log(curVal.urls.full) */
          }
          return (
            <img
              className=" flex object-cover border-2 mt-2 -my-2  w-96 h-80"
              src={curVal.urls.full}
            />
          );
        })}
      </div>
      <div className="flex gap-3 justify-center items-center ">
        <button
          onClick={Previous}
          className=" w-20 h-11 justify-center font-semibold items-center bg-blue-600 rounded-2xl cursor-pointer"
        >
          prePage
        </button>
        <p className="rounded-full font-bold w-3 h-3">{count}</p>
        <button
          onClick={AddImage}
          className="w-20 h-11 items-center font-semibold  bg-blue-600 rounded-2xl cursor-pointer"
        >
          NextPage
        </button>
        <button
          onClick={getData}
          className="w-20 h-11 items-center font-semibold  bg-blue-600 rounded-2xl cursor-pointer"
        >
          go
        </button>
      </div>
    </>
  );
}

export default App
