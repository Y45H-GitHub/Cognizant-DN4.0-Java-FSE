import React from "react";

class Post {
  constructor(id, title, body) {
    this.id = id;
    this.title = title;
    this.body = body;
  }
}

class Posts extends React.Component {
  constructor(props) {
    super(props);

    // Step 5: Initialize state with empty list of posts
    this.state = {
      posts: [],
    };
  }

  // Step 6: Create loadPosts method to fetch posts
  loadPosts = () => {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => response.json())
      .then((data) => {
        // Map fetched posts into Post class instances
        const postList = data.map(
          (item) => new Post(item.id, item.title, item.body)
        );
        this.setState({ posts: postList });
      })
      .catch((error) => {
        console.error("Error fetching posts:", error);
        alert("Failed to load posts.");
      });
  };

  // Step 7: Use componentDidMount to call loadPosts
  componentDidMount() {
    this.loadPosts();
  }

  // Step 9: Catch rendering errors
  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
  }

  // Step 8: Render posts
  render() {
    return (
      <div>
        <h2>Post List</h2>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
